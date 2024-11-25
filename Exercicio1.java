package Exercios2;

import java.util.Scanner;

public class Exercicio1 {

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

            // Imprimindo a matriz original
            System.out.println("Matriz original:");
            imprimirMatriz(matriz);

            // Rotacionando a matriz 90 graus no sentido horário
            rotacionarMatriz(matriz);

            // Imprimindo a matriz rotacionada
            System.out.println("Matriz rotacionada:");
            imprimirMatriz(matriz);
        }

        // Função para rotacionar a matriz 90 graus no sentido horário
        public static void rotacionarMatriz(int[][] matriz) {
            int n = matriz.length;
            for (int layer = 0; layer < n / 2; layer++) {
                int first = layer;
                int last = n - layer - 1;
                for (int i = first; i < last; i++) {
                    int offset = i - first;
                    int top = matriz[first][i];

                    // mover elementos para a esquerda
                    matriz[first][i] = matriz[last-offset][first];

                    // mover elementos para cima
                    matriz[last-offset][first] = matriz[last][last-offset];

                    // mover elementos para a direita
                    matriz[last][last-offset] = matriz[i][last];

                    // mover elemento superior para a esquerda
                    matriz[i][last] = top;
                }
            }
        }

        // Função para imprimir a matriz
        public static void imprimirMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

