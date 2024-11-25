public class ExercicioVetor {
    public static void main(String[] args) {
        int[] NumerosVetor = new int[10] ;
        for (int i = 0; i < NumerosVetor.length; i++) {
            NumerosVetor[i] = (int) (Math.random() * 11);
        }

        int soma = 0;
        for (int numero : NumerosVetor) {
            soma += numero;
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}


