package co.argm.app;

import co.argm.app.exception.InsufficientMoneyException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static java.lang.System.*;
import static java.math.BigDecimal.ZERO;
import static java.math.BigDecimal.valueOf;
import static java.time.Duration.ofSeconds;
import static java.util.Arrays.asList;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static org.junit.jupiter.api.condition.JRE.JAVA_22;
import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.OS.*;

/**
 * Pruebas unitarias para la clase Account.
 */
class AccountTest {
    private Account account;
    private TestInfo info;
    private TestReporter reporter;

    @BeforeAll
    static void beforeAll() {
        out.println("Initializing the test");
    }

    @AfterAll
    static void afterAll() {
        out.println("Ending the test");
    }

    static List<String> amountList() {
        return asList("100", "200", "300", "400", "1000");
    }

    @BeforeEach
    void setUp(TestInfo info, TestReporter reporter) {
        account = new Account("Andrew", new BigDecimal("1000.12345"));
        this.info = info;
        this.reporter = reporter;
        out.println("Starting the method");
        reporter.publishEntry(" running: " + info.getDisplayName() + " " + info.getTestMethod().orElse(null).getName() + " with the labels " + info.getTags());
    }

    @AfterEach
    void tearDown() {
        out.println("Ending the method");
    }

    @Tag("account")
    @Tag("error")
    @Test
    void accountInsufficientMoneyException() {
        Exception e = assertThrows(InsufficientMoneyException.class, () -> account.debit(valueOf(1500)));
        assertEquals("Insufficient money", e.getMessage());
    }

    @Tag("account")
    @Tag("bank")
    @Test
    @DisplayName("Testing relations between accounts")
    void bankAccountRelationship() {
        account = new Account("Jonn Doe", new BigDecimal("2500"));
        Account account2 = new Account("Andrew", new BigDecimal("1500.8989"));
        Bank bank = new Bank("Bancolombia").addAccount(account).addAccount(account2);
        assertAll(() -> assertEquals(2, bank.getAccounts().size(), "The bank does not have the expected accounts"),
                () -> assertEquals("Bancolombia", account.getBank().getName()),
                () -> assertTrue(bank.getAccounts().stream().anyMatch(a -> a.getPerson().equals("Andrew"))));
    }

    @Test
    void accountBalanceDev() {
        boolean isDevEnv = "dev".equals(System.getProperty("ENV"));
        assumingThat(isDevEnv, () -> assertEquals(new BigDecimal("1000.123456"), account.getBalance()));
        assertFalse(account.getBalance().compareTo(ZERO) < 0);
        assertTrue(account.getBalance().compareTo(ZERO) > 0);
    }

    @DisplayName("Testing debit account repeat")
    @RepeatedTest(value = 5, name = "{displayName} - Num repetition {currentRepetition} of {totalRepetitions}")
    void accountDebitRepeat(RepetitionInfo info) {
        if (info.getCurrentRepetition() == 3) {
            out.println("We are in the repetition " + info.getCurrentRepetition());
        }
        account.debit(valueOf(100));
        assertEquals(new BigDecimal("900.12345"), account.getBalance());
    }

    @Tag("param")
    @ParameterizedTest(name = "num {index} executing with value {0}")
    @MethodSource("amountList")
    void accountDebitMethodSource(String amount) {
        account.debit(new BigDecimal(amount));
        assertTrue(account.getBalance().compareTo(ZERO) > 0);
    }

    @Test
    void timeoutAssertions() {
        assertTimeout(ofSeconds(5), () -> MILLISECONDS.sleep(4900));
    }

    @Tag("param")
    @Nested
    @DisplayName("Parameterized Tests")
    class ParameterizedTests {
        @ParameterizedTest(name = "num {index} executing with value {0}")
        @ValueSource(strings = {"100", "200", "300", "500", "700", "1000"})
        void accountDebitValueSource(String amount) {
            account.debit(new BigDecimal(amount));
            assertTrue(account.getBalance().compareTo(ZERO) > 0);
        }

        @ParameterizedTest(name = "num {index} executing with value {0}")
        @CsvSource({"200, 100, John, Andrew", "250, 200, Pepe, Pepe", "300, 300, maria, Maria", "510, 500, Pepa, Pepa",
                "750, 700, Lucas, Luca", "1000, 1000, Cata, Cata"})
        void accountDebitCsvSource(String balance, String amount, String waited, String actual) {
            account = new Account(actual, new BigDecimal(balance));
            account.debit(new BigDecimal(amount));
            assertAll(() -> assertEquals(waited, actual),
                    () -> assertTrue(account.getBalance().compareTo(ZERO) > 0));
        }

        @ParameterizedTest(name = "num {index} executing with value {0}")
        @CsvFileSource(resources = "/data.csv")
        void accountDebitCsvFileSource(String balance, String amount, String waited, String actual) {
            account = new Account(actual, new BigDecimal(balance));
            account.debit(new BigDecimal(amount));
            assertAll(() -> assertEquals(waited, actual),
                    () -> assertTrue(account.getBalance().compareTo(ZERO) > 0));
        }
    }

    @Tag("account")
    @Nested
    @DisplayName("Testing account attributes")
    class AccountNameBalanceTest {
        @Test
        @DisplayName("The name")
        void name() {
            reporter.publishEntry(info.getTags().toString());
            if (info.getTags().contains("account")) reporter.publishEntry("Doing something with the label counts");

            assertAll(() -> assertNotNull(account.getPerson(), "The account cannot be null"),
                    () -> assertEquals("Andrew", account.getPerson(), "The account name is not the one expected"));
        }

        @Test
        @DisplayName("The balance, other than null, greater than zero and the expected value")
        void balance() {
            assertAll(() -> assertEquals(new BigDecimal("1000.12345"), account.getBalance()),
                    () -> assertFalse(account.getBalance().compareTo(ZERO) < 0),
                    () -> assertTrue(account.getBalance().compareTo(ZERO) > 0));
        }

        @Test
        @DisplayName("Testing references for equality with the equals method")
        void reference() {
            account = new Account("Jonn Doe", new BigDecimal("8900.9997"));
            Account account2 = new Account("Jonn Doe", new BigDecimal("8900.9997"));
            assertEquals(account, account2);
        }
    }

    @Nested
    @DisplayName("Account Operations Test")
    class AccountOperationsTest {
        @Tag("account")
        @Test
        void accountDebit() {
            account.debit(valueOf(100));
            assertEquals(new BigDecimal("900.12345"), account.getBalance());
        }

        @Tag("account")
        @Test
        void accountCredit() {
            account.credit(valueOf(100));
            assertEquals(new BigDecimal("1100.12345"), account.getBalance());
        }

        @Tag("account")
        @Tag("bank")
        @Test
        void accountsTransferMoney() {
            account = new Account("Jonn Doe", new BigDecimal("2500"));
            Account account2 = new Account("Andrew", new BigDecimal("1500.8989"));
            Bank bank = new Bank("Bancolombia");
            bank.transfer(account2, account, new BigDecimal(500));
            assertAll(() -> assertEquals(new BigDecimal("1000.8989"), account2.getBalance(), "The account2 balance value is not as expected"),
                    () -> assertEquals(new BigDecimal("3000"), account.getBalance(), "The account1 balance value is not as expected"));
        }
    }

    @Nested
    class OperatingSystemTest {
        @Test
        @EnabledOnOs(WINDOWS)
        void windowsOnly() {
        }

        @Test
        @EnabledOnOs({LINUX, MAC})
        void linuxMacOnly() {
        }

        @Test
        @DisabledOnOs(WINDOWS)
        void notWindows() {
        }
    }

    @Nested
    class JavaVersionTest {
        @Test
        @EnabledOnJre(JAVA_8)
        void jdk8Only() {
        }

        @Test
        @EnabledOnJre(JAVA_22)
        void jdk22Only() {
        }

        @Test
        @DisabledOnJre(JAVA_22)
        void noJdk22() {
        }
    }

    @Nested
    class SystemPropertiesTest {
        @Test
        void printSystemProperties() {
            Properties properties = getProperties();
            properties.forEach((k, v) -> out.println(k + ":" + v));
        }

        @Test
        @EnabledIfSystemProperty(named = "java.version", matches = ".*22.*")
        void javaVersion() {
        }

        @Test
        @DisabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
        void only64() {
        }

        @Test
        @EnabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
        void no64() {
        }

        @Test
        @EnabledIfSystemProperty(named = "user.name", matches = "andre")
        void username() {
        }

        @Test
        @EnabledIfSystemProperty(named = "ENV", matches = "dev")
        void dev() {
        }
    }

    @Nested
    class EnvironmentalVariables {
        @Test
        void printEnvironmentalVariables() {
            Map<String, String> env = getenv();
            env.forEach((k, v) -> out.println(k + ":" + v));
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*jdk-22.*")
        void javaHome() {
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "16")
        void processors() {
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "ENVIRONMENT", matches = "dev")
        void env() {
        }

        @Test
        @DisabledIfEnvironmentVariable(named = "ENVIRONMENT", matches = "prod")
        void envProd() {
        }
    }

    @Nested
    @Tag("timeout")
    class TimeoutTest {
        @Test
        @Timeout(value = 1000, unit = MILLISECONDS)
        void timeOut() throws InterruptedException {
            MILLISECONDS.sleep(900);
        }
    }
}
