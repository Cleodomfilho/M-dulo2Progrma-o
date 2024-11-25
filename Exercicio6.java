package Exercios2;

import java.util.Scanner;

public class Exercicio6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Criando a matriz 3x3
            int[][] matriz = new int[3][3];

            // Lendo os elementos da matriz
            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = scanner.nextInt();
                }
            }

            //  Imprimindo Matriz
            System.out.println("Matriz original:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }


            // Calculando o determinante usando a Regra de Sarrus
            int det = matriz[0][0] * matriz[1][1] * matriz[2][2]
                    + matriz[0][1] * matriz[1][2] * matriz[2][0]
                    + matriz[0][2] * matriz[1][0] * matriz[2][1]
                    - matriz[0][2] * matriz[1][1] * matriz[2][0]
                    - matriz[0][1] * matriz[1][0] * matriz[2][2]
                    - matriz[0][0] * matriz[1][2] * matriz[2][1];

            // Imprimindo o determinante
            System.out.println("O determinante da matriz é: " + det);
        }
    }
