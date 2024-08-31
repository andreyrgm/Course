package co.argm.app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un banco.
 */
public class Bank {
    private final String name;
    private final List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Bank addAccount(Account account) {
        accounts.add(account);
        account.bank = this;
        return this;
    }

    /**
     * Transfiere dinero de una cuenta a otra.
     *
     * @param origin  Cuenta de origen.
     * @param destiny Cuenta de destino.
     * @param amount  Monto a transferir.
     */
    public void transfer(Account origin, Account destiny, BigDecimal amount) {
        origin.debit(amount);
        destiny.credit(amount);
    }
}
