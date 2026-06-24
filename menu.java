import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("====================================");
        System.out.println("       BEM-VINDO À CALCULADORA      ");
        System.out.println("====================================");

        // Loop principal do menu
        do {
            exibirMenu();
            opcao = lerOpcaoValida(scanner);

            // Se o usuário escolher de 1 a 4, pedimos os números antes
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = lerNumeroValido(scanner);
                System.out.print("Digite o segundo número: ");
                double num2 = lerNumeroValido(scanner);

                // Integração estruturada com base nos métodos dos colegas
                switch (opcao) {
                    case 1:
                        System.out.println("\n--- Operação: Soma ---");
                        // O rapaz que fizer os testes só precisa descomentar as duas linhas abaixo:
                        // double resultadoSoma = Soma.somar(num1, num2);
                        // System.out.println("Resultado: " + resultadoSoma);
                        System.out.println("[Menu] Aqui chamará: Soma.somar(" + num1 + ", " + num2 + ")");
                        break;
                    case 2:
                        System.out.println("\n--- Operação: Subtração ---");
                        // O rapaz que fizer os testes só precisa descomentar as duas linhas abaixo:
                        // double resultadoSub = Subtracao.subtrair(num1, num2);
                        // System.out.println("Resultado: " + resultadoSub);
                        System.out.println("[Menu] Aqui chamará: Subtracao.subtrair(" + num1 + ", " + num2 + ")");
                        break;
                    case 3:
                        System.out.println("\n--- Operação: Multiplicação ---");
                        // O rapaz que fizer os testes só precisa descomentar as duas linhas abaixo:
                        // double resultadoMult = Multiplicacao.multiplicar(num1, num2);
                        // System.out.println("Resultado: " + resultadoMult);
                        System.out.println("[Menu] Aqui chamará: Multiplicacao.multiplicar(" + num1 + ", " + num2 + ")");
                        break;
                    case 4:
                        System.out.println("\n--- Operação: Divisão ---");
                        // Validação inteligente para evitar erro de divisão por zero
                        if (num2 == 0) {
                            System.out.println("[Erro] Não é possível dividir por zero.");
                        } else {
                            // O rapaz que fizer os testes só precisa descomentar as duas linhas abaixo:
                            // double resultadoDiv = Divisao.dividir(num1, num2);
                            // System.out.println("Resultado: " + resultadoDiv);
                            System.out.println("[Menu] Aqui chamará: Divisao.dividir(" + num1 + ", " + num2 + ")");
                        }
                        break;
                }
            } else if (opcao == 5) {
                System.out.println("\nSaindo do sistema... Até logo!");
            }

            System.out.println(); // Linha em branco para organizar o visual

        } while (opcao != 5);

        scanner.close();
    }

    /**
     * Responsabilidade 2: Exibir o menu estruturado para o usuário.
     */
    private static void exibirMenu() {
        System.out.println("Escolha uma das operações abaixo:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("Digite a sua opção: ");
    }

    /**
     * Responsabilidade 3 e 5: Receber a entrada da opção do menu e tratar erros.
     */
    private static int lerOpcaoValida(Scanner scanner) {
        int opcao = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                opcao = scanner.nextInt();

                if (opcao >= 1 && opcao <= 5) {
                    entradaValida = true;
                } else {
                    System.out.print("[Erro] Opção inexistente! Digite um número de 1 a 5: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("[Erro] Entrada inválida! Digite apenas números inteiros: ");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
        return opcao;
    }

    /**
     * Responsabilidade 5: Validar se o usuário digitou números (double) válidos
     * nas operações para o sistema não quebrar com letras.
     */
    private static double lerNumeroValido(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("[Erro] Valor inválido! Digite um número válido: ");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
    }
}