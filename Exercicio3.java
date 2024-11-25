package Exercios2;

import java.util.Scanner;

public class Exercicio3 {

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

            //  Imprimindo Matriz
            System.out.println("Matriz original:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            // Encontrando o valor máximo e sua posição
            int maximo = matriz[0][0];
            int linhaMaximo = 0;
            int colunaMaximo = 0;

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (matriz[i][j] > maximo) {
                        maximo = matriz[i][j];
                        linhaMaximo = i;
                        colunaMaximo = j;
                    }
                }
            }

            // Imprimindo o resultado
            System.out.println("O valor máximo é: " + maximo);
            System.out.println("Posição do valor máximo: Linha " + linhaMaximo + ", Coluna " + colunaMaximo);
        }
    }
