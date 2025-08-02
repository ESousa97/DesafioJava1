import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Classe principal de simulação de um banco digital simples.
 * Permite consultar saldo, depositar, transferir e sair do sistema.
 */
public class Desafio {
    // Scanner estático para entrada de dados no terminal
    private static final Scanner scanner = new Scanner(System.in);

    // Dados fictícios do cliente e conta
    private static String nome = "Jose Enoque";
    private static String conta = "Corrente";
    private static double saldo = 2000.00;

    /**
     * Método principal. Inicia o menu de operações bancárias.
     */
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Banco Digital!");

        int operacao;
        // Loop principal do menu. Só sai quando o usuário escolhe "Sair" (opção 4)
        do {
            exibirMenu();
            operacao = lerOpcao();
            processarOperacao(operacao);
            if (operacao != 4) {
                pausar();
            }
        } while (operacao != 4);

        System.out.println("Obrigado por utilizar nossos serviços. Até logo!");
        scanner.close();
    }

    /**
     * Exibe o menu principal com as opções disponíveis ao cliente.
     */
    private static void exibirMenu() {
        System.out.println("\n" + "=".repeat(35));
        System.out.printf("Cliente: %s%n", nome);
        System.out.printf("Conta: %s%n", conta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("=".repeat(35));
        System.out.println("1  Consultar saldo");
        System.out.println("2  Depositar valor");
        System.out.println("3  Transferir valor");
        System.out.println("4  Sair");
        System.out.print("Escolha uma opção: ");
    }

    /**
     * Lê a opção escolhida pelo usuário.
     * Garante que apenas números inteiros são aceitos.
     * 
     * @return O número da opção escolhida, ou 0 em caso de entrada inválida.
     */
    private static int lerOpcao() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpa o buffer do scanner
            System.out.println("Opção inválida! Digite apenas números de 1 a 4.");
            return 0;
        }
    }

    /**
     * Processa a operação bancária escolhida pelo usuário.
     * 
     * @param operacao O número da operação selecionada.
     */
    private static void processarOperacao(int operacao) {
        switch (operacao) {
            case 1:
                // Exibe o saldo atual
                System.out.printf("Seu saldo atual: R$ %.2f%n", saldo);
                break;
            case 2:
                // Chama o método de depósito
                depositar();
                break;
            case 3:
                // Chama o método de transferência
                transferir();
                break;
            case 4:
                // Encerra o programa
                break;
            default:
                // Informa sobre opção inválida
                System.out.println("Opção inválida! Escolha entre 1 e 4.");
                break;
        }
    }

    /**
     * Realiza a operação de depósito de um valor no saldo.
     */
    private static void depositar() {
        System.out.print("Digite o valor para depósito: R$ ");
        double valor = lerValor();
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito realizado! Novo saldo: R$ %.2f%n", saldo);
        } else {
            System.out.println("Valor deve ser maior que zero!");
        }
    }

    /**
     * Realiza a transferência de um valor do saldo, se houver saldo suficiente.
     */
    private static void transferir() {
        System.out.print("Digite o valor para transferência: R$ ");
        double valor = lerValor();
        if (valor <= 0) {
            System.out.println("Valor deve ser maior que zero!");
        } else if (valor > saldo) {
            System.out.printf("Saldo insuficiente! Disponível: R$ %.2f%n", saldo);
        } else {
            saldo -= valor;
            System.out.printf("Transferência realizada! Novo saldo: R$ %.2f%n", saldo);
        }
    }

    /**
     * Lê um valor do usuário, validando se é um número válido.
     * 
     * @return Valor digitado, ou -1 em caso de entrada inválida.
     */
    private static double lerValor() {
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpa o buffer
            System.out.println("Valor inválido! Digite apenas números.");
            return -1;
        }
    }

    /**
     * Pausa o sistema, aguardando o usuário pressionar ENTER para continuar.
     */
    private static void pausar() {
        System.out.print("\nPressione ENTER para continuar...");
        scanner.nextLine(); // Para consumir o \n deixado pelo nextInt/nextDouble
        scanner.nextLine(); // Aguarda o ENTER real do usuário
    }
}
