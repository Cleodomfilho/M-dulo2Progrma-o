import java.util.Scanner;

public class Exercicio3BuscaEmUmVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o vetor (exemplo com valores fixos)
        int[] vetor = {2, 5, 8, 12, 7, 3};

        // Solicitando o valor a ser buscado
        System.out.print("Digite o valor a ser buscado: ");
        int valorBuscado = scanner.nextInt();

        // Realizando a busca
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorBuscado) {
                System.out.println("O valor " + valorBuscado + " foi encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }

        // Se o valor não foi encontrado
        if (!encontrado) {
            System.out.println("O valor " + valorBuscado + " não foi encontrado no vetor.");
        }
    }
}


