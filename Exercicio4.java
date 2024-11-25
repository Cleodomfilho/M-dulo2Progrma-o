package Exercios2;

import java.util.Scanner;

public class Exercicio4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Criando um vetor de 10 elementos
            int[] vetor = new int[10];

            // Lendo os elementos do vetor
            System.out.println("Digite 10 números inteiros:");
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = scanner.nextInt();
            }

            // Invertendo o vetor
            int aux;
            for (int i = 0; i < vetor.length / 2; i++) {
                aux = vetor[i];
                vetor[i] = vetor[vetor.length - i - 1];
                vetor[vetor.length - i - 1] = aux;
            }

            // Imprimindo o vetor invertido
            System.out.println("Vetor invertido:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
        }
    }