package io.github.esousa97.desafio;

import io.github.esousa97.desafio.cli.BankCli;
import io.github.esousa97.desafio.domain.BankAccount;
import io.github.esousa97.desafio.service.BankService;
import java.util.Scanner;

public final class DesafioApplication {
  private static final String CUSTOMER_NAME = "Jose Enoque";
  private static final String ACCOUNT_TYPE = "Corrente";
  private static final double INITIAL_BALANCE = 2000.00;

  private DesafioApplication() {}

  public static void main(final String[] args) {
    System.out.println("Bem-vindo ao Banco Digital!");
    final BankAccount bankAccount = new BankAccount(CUSTOMER_NAME, ACCOUNT_TYPE, INITIAL_BALANCE);
    final BankService bankService = new BankService(bankAccount);

    try (Scanner scanner = new Scanner(System.in)) {
      final BankCli cli = new BankCli(bankService, scanner);
      cli.run();
    }
  }
}
