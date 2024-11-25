package Exercios2;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lendo as dimensões da matriz
            System.out.print("Digite o número de linhas da matriz: ");
            int linhas = scanner.nextInt();
            System.out.print("Digite o número de colunas da matriz: ");
            int colunas = scanner.nextInt();

            // Criando a matriz
            int[][] matriz = new int[linhas][colunas];

            // Lendo os elementos da matriz
            System.out.println("Digite os elementos da matriz:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    matriz[i][j] = scanner.nextInt();
                }
            }

        //  Imprimindo Matriz Original
        System.out.println("Matriz original:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

            // Lendo o número inteiro pelo qual multiplicar
            System.out.print("Digite o número inteiro para multiplicar: ");
            int multiplicador = scanner.nextInt();

            // Multiplicando cada elemento da matriz
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    matriz[i][j] *= multiplicador;
                }
            }

            // Imprimindo a matriz resultante
            System.out.println("Matriz após a multiplicação:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
