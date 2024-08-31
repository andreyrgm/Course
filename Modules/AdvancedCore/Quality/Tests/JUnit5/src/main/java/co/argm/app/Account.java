package co.argm.app;

import co.argm.app.exception.InsufficientMoneyException;

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.BigDecimal.ZERO;

/**
 * Clase que representa una cuenta bancaria.
 */
public class Account {
    final String person;
    BigDecimal balance;
    Bank bank;

    public Account(String person, BigDecimal balance) {
        this.person = person;
        this.balance = balance;
    }

    public String getPerson() {
        return person;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    /**
     * Debita un monto de la cuenta, si hay suficientes fondos.
     *
     * @param amount Monto a debitar.
     * @throws InsufficientMoneyException Si los fondos son insuficientes.
     */
    public void debit(BigDecimal amount) {
        BigDecimal newBalance = balance.subtract(amount);
        if (newBalance.compareTo(ZERO) < 0) {
            throw new InsufficientMoneyException("Insufficient money");
        }
        balance = newBalance;
    }

    /**
     * Acredita un monto a la cuenta.
     *
     * @param amount Monto a acreditar.
     */
    public void credit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Objects.equals(person, account.person) && Objects.equals(balance, account.balance);
    }
}
