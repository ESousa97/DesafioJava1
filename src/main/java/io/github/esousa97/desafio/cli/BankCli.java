package io.github.esousa97.desafio.cli;

import io.github.esousa97.desafio.exception.BusinessException;
import io.github.esousa97.desafio.service.BankService;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class BankCli {
  private static final int OPTION_BALANCE = 1;
  private static final int OPTION_DEPOSIT = 2;
  private static final int OPTION_TRANSFER = 3;
  private static final int OPTION_EXIT = 4;

  private final BankService bankService;
  private final Scanner scanner;

  public BankCli(final BankService bankService, final Scanner scanner) {
    this.bankService = bankService;
    this.scanner = scanner;
  }

  public void run() {
    int operation;
    do {
      printMenu();
      operation = readOption();
      execute(operation);
      if (operation != OPTION_EXIT) {
        pause();
      }
    } while (operation != OPTION_EXIT);

    System.out.println("Obrigado por utilizar nossos serviços. Até logo!");
  }

  private void printMenu() {
    System.out.println("\n" + "=".repeat(35));
    System.out.printf(Locale.US, "Cliente: %s%n", bankService.customerName());
    System.out.printf(Locale.US, "Conta: %s%n", bankService.accountType());
    System.out.printf(Locale.US, "Saldo: R$ %.2f%n", bankService.currentBalance());
    System.out.println("=".repeat(35));
    System.out.println("1  Consultar saldo");
    System.out.println("2  Depositar valor");
    System.out.println("3  Transferir valor");
    System.out.println("4  Sair");
    System.out.print("Escolha uma opção: ");
  }

  private int readOption() {
    try {
      return scanner.nextInt();
    } catch (InputMismatchException exception) {
      scanner.nextLine();
      System.out.println("Opção inválida. Digite um número entre 1 e 4.");
      return 0;
    }
  }

  private void execute(final int operation) {
    switch (operation) {
      case OPTION_BALANCE ->
          System.out.printf(Locale.US, "Seu saldo atual: R$ %.2f%n", bankService.currentBalance());
      case OPTION_DEPOSIT -> processDeposit();
      case OPTION_TRANSFER -> processTransfer();
      case OPTION_EXIT -> {}
      default -> System.out.println("Opção inválida. Escolha entre 1 e 4.");
    }
  }

  private void processDeposit() {
    System.out.print("Digite o valor para depósito: R$ ");
    final double amount = readAmount();
    if (amount < 0) {
      return;
    }

    try {
      final double newBalance = bankService.deposit(amount);
      System.out.printf(Locale.US, "Depósito realizado! Novo saldo: R$ %.2f%n", newBalance);
    } catch (BusinessException exception) {
      printError(exception);
    }
  }

  private void processTransfer() {
    System.out.print("Digite o valor para transferência: R$ ");
    final double amount = readAmount();
    if (amount < 0) {
      return;
    }

    try {
      final double newBalance = bankService.transfer(amount);
      System.out.printf(Locale.US, "Transferência realizada! Novo saldo: R$ %.2f%n", newBalance);
    } catch (BusinessException exception) {
      printError(exception);
    }
  }

  private double readAmount() {
    try {
      return scanner.nextDouble();
    } catch (InputMismatchException exception) {
      scanner.nextLine();
      System.out.println("Valor inválido. Digite apenas números.");
      return -1;
    }
  }

  private void pause() {
    System.out.print("\nPressione ENTER para continuar...");
    scanner.nextLine();
    scanner.nextLine();
  }

  private static void printError(final BusinessException exception) {
    System.out.printf("Erro [%s]: %s%n", exception.getCode(), exception.getMessage());
  }
}
