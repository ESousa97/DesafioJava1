package io.github.esousa97.desafio.domain;

import io.github.esousa97.desafio.exception.BusinessException;

public class BankAccount {
  private final String customerName;
  private final String accountType;
  private double balance;

  public BankAccount(
      final String customerName, final String accountType, final double initialBalance) {
    this.customerName = customerName;
    this.accountType = accountType;
    this.balance = initialBalance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getAccountType() {
    return accountType;
  }

  public double getBalance() {
    return balance;
  }

  public double deposit(final double amount) {
    validatePositiveAmount(amount, "INVALID_DEPOSIT_AMOUNT");
    balance += amount;
    return balance;
  }

  public double transfer(final double amount) {
    validatePositiveAmount(amount, "INVALID_TRANSFER_AMOUNT");
    if (amount > balance) {
      throw new BusinessException(
          "INSUFFICIENT_FUNDS", "Não há saldo suficiente para fazer essa transferência.");
    }

    balance -= amount;
    return balance;
  }

  private static void validatePositiveAmount(final double amount, final String code) {
    if (amount <= 0) {
      throw new BusinessException(code, "O valor deve ser maior que zero.");
    }
  }
}
