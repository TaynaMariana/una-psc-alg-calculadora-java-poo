package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        char escolha;
        do {
            System.out.println("Escolha a operação desejada:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("Q - Sair");

            escolha = scanner.next().charAt(0);

            if (escolha == 'Q' || escolha == 'q') {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.println("Digite o primeiro número:");
            double numeroUm = scanner.nextDouble();

            if (escolha != '6') {
                System.out.println("Digite o segundo número:");
            }
            double numeroDois = 0;

            if (escolha != '6') {
                numeroDois = scanner.nextDouble();
            }

            double resultado = 0;

            switch (escolha) {
                case '1':
                    resultado = calculadora.adicao(numeroUm, numeroDois);
                    break;
                case '2':
                    resultado = calculadora.subtracao(numeroUm, numeroDois);
                    break;
                case '3':
                    resultado = calculadora.multiplicacao(numeroUm, numeroDois);
                    break;
                case '4':
                    resultado = calculadora.divisao(numeroUm, numeroDois);
                    break;
                case '5':
                    resultado = calculadora.potencia(numeroUm, numeroDois);
                    break;
                case '6':
                    resultado = calculadora.raizQuadrada(numeroUm);
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    continue;
            }

            if (!Double.isNaN(resultado)) {
                System.out.println("Resultado: " + resultado);
            }
        } while (true);

        scanner.close();
    }
}

