package io.github.esousa97.desafio.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.github.esousa97.desafio.domain.BankAccount;
import io.github.esousa97.desafio.exception.BusinessException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankServiceTest {
  private BankService bankService;

  @BeforeEach
  void setUp() {
    final BankAccount account = new BankAccount("Jose Enoque", "Corrente", 2000.00);
    bankService = new BankService(account);
  }

  @Test
  void shouldDepositSuccessfully() {
    final double newBalance = bankService.deposit(500.00);
    assertEquals(2500.00, newBalance, 0.001);
  }

  @Test
  void shouldThrowWhenDepositIsNegative() {
    assertThrows(BusinessException.class, () -> bankService.deposit(-1.00));
  }

  @Test
  void shouldTransferSuccessfully() {
    final double newBalance = bankService.transfer(300.00);
    assertEquals(1700.00, newBalance, 0.001);
  }

  @Test
  void shouldThrowWhenTransferExceedsBalance() {
    assertThrows(BusinessException.class, () -> bankService.transfer(5000.00));
  }
}
