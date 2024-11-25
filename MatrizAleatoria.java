import java.util.Random;

public class MatrizAleatoria {
        public static void main(String[] args) {
            Random random = new Random();

            int linhas = random.nextInt(9) + 2;
            int colunas = random.nextInt(9) + 2;

            int[][] matriz = new int[linhas][colunas];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = random.nextInt(100);
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();

            }
        }
    }

