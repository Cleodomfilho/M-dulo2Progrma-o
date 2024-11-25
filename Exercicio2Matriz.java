import java.util.Scanner;

public class Exercicio2Matriz {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        System.out.print("Digite o valor escalar: ");
        int escalar = Scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= escalar;
            }
        }

        System.out.println("\nMatriz após a multiplicação:");
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}


