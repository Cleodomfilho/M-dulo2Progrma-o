package Exercios2;

import java.util.Scanner;

public class Exercicio2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lendo o tamanho da matriz
            System.out.print("Digite o tamanho da matriz quadrada: ");
            int n = scanner.nextInt();

            // Criando a matriz
            int[][] matriz = new int[n][n];

            // Lendo os elementos da matriz
            System.out.println("Digite os elementos da matriz:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = scanner.nextInt();
                }
            }

            //  Imprimindo Matriz
            System.out.println("Matriz original:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            // Verificando se a matriz é simétrica
            boolean simetrica = true;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                        break;
                    }
                }
                if (!simetrica) {
                    break;
                }
            }

            // Imprimindo o resultado
            if (simetrica) {
                System.out.println("A matriz é simétrica.");
            } else {
                System.out.println("A matriz não é simétrica.");
            }
        }
    }

