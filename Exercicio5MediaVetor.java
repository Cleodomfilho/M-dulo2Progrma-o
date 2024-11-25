public class Exercicio5MediaVetor {
    public static void main(String[] args) {

                int[] numeros = {10, 20, 30, 40, 50};

                int soma = 0;

                for (int numero : numeros) {
                    soma += numero;
                }

                double media = (double) soma / numeros.length;

                System.out.println("A média dos elementos do vetor é: " + media);
            }
        }


