package Exercios2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a dimensão da matriz
        System.out.print("Digite a dimensão da matriz quadrada: ");
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calculando a soma dos elementos da borda
        int somaBorda = 0;
        for (int i = 0; i < n; i++) {
            somaBorda += matriz[i][0] + matriz[i][n - 1]; // Primeira e última coluna
        }
        for (int j = 1; j < n - 1; j++) {
            somaBorda += matriz[0][j] + matriz[n - 1][j]; // Primeira e última linha (sem os cantos)
        }

        // Imprimindo a soma
        System.out.println("A soma dos elementos da borda é: " + somaBorda);
    }
}
