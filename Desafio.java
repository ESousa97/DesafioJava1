// Desafio final do curso Alura.

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao;

        String nome = "Jose Enoque";
        String conta = "Corrente";
        double saldo = 2000;

        do {
            // Exibir menu
            System.out.println("\n***********************");
            System.out.println("Nome: " + nome);
            System.out.println("Conta: " + conta);
            System.out.printf("Saldo: R$ %.2f%n", saldo);
            System.out.println("***********************");

            System.out.println("\nOperações:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.printf("Seu saldo atual é de: R$ %.2f%n", saldo);
                    break;
                case 2:
                    saldo = recebeValor(scanner, saldo);  // Recebe o novo saldo
                    break;
                case 3:
                    saldo = transfereValor(scanner, saldo);  // Recebe o novo saldo
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nosso sistema! Agora você pode ir com segurança!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
            }
        } while (operacao != 4);

        scanner.close();
    }

    // Metodo corrigido para receber valor
    public static double recebeValor(Scanner scanner, double saldoAtual) {
        System.out.print("Digite o valor a receber: R$ ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            double novoSaldo = saldoAtual + valor;
            System.out.printf(" Valor recebido! Novo saldo: R$ %.2f%n", novoSaldo);
            return novoSaldo;
        } else {
            System.out.println(" Valor inválido! O valor deve ser maior que zero.");
            return saldoAtual;  // Retorna saldo sem alteração
        }
    }

    public static double transfereValor(Scanner scanner, double saldoAtual) {
        System.out.print("Digite o valor a transferir: R$ ");
        double valor = scanner.nextDouble();

        if (valor > 0) {  // Valor deve ser positivo
            if (valor <= saldoAtual) {  // Verifica se há saldo suficiente
                double novoSaldo = saldoAtual - valor;  // Subtrai do saldo atual
                System.out.printf(" Transferência realizada! Novo saldo: R$ %.2f%n", novoSaldo);
                return novoSaldo;
            } else {
                System.out.println(" Saldo insuficiente para a transferência!");
                System.out.printf("   Saldo disponível: R$ %.2f%n", saldoAtual);
                return saldoAtual;
            }
        } else {
            System.out.println(" Valor inválido! O valor deve ser maior que zero.");
            return saldoAtual;
        }
    }
}