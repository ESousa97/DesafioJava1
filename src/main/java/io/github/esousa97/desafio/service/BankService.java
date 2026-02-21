package io.github.esousa97.desafio.service;

import io.github.esousa97.desafio.domain.BankAccount;

public class BankService {
  private final BankAccount account;

  public BankService(final BankAccount account) {
    this.account = account;
  }

  public String customerName() {
    return account.getCustomerName();
  }

  public String accountType() {
    return account.getAccountType();
  }

  public double currentBalance() {
    return account.getBalance();
  }

  public double deposit(final double amount) {
    return account.deposit(amount);
  }

  public double transfer(final double amount) {
    return account.transfer(amount);
  }
}
