package Exercios2;

import java.util.Scanner;

public class Exercicio7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Criando a matriz 4x4
            int[][] matriz = new int[4][4];

            // Lendo os elementos da matriz
            System.out.println("Digite os elementos da matriz 4x4:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz[i][j] = scanner.nextInt();
                }
            }

            //  Imprimindo Matriz
            System.out.println("Matriz original:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            // Calculando a soma da diagonal secundária
            int somaDiagonalSecundaria = 0;
            for (int i = 0; i < 4; i++) {
                somaDiagonalSecundaria += matriz[i][3 - i];
            }

            // Imprimindo a soma
            System.out.println("A soma da diagonal secundária é: " + somaDiagonalSecundaria);
        }
    }