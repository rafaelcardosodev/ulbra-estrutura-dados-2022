import java.util.Scanner;

public class IndiceVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[4];
        int vetorPosicao[] = new int[4];
        int vetorMaior[] = new int[4];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] > 50) {
                vetorPosicao[i] = i;
                vetorMaior[i] = vetor[i];
            }
        }

        System.out.println("VETORES MAIORES QUE 50 - POSIÇAO");
        for (int i = 0; i < vetor.length; i++) {
            if (vetorMaior[i] != 0) {
                System.out.println(vetorMaior[i] + " - " + vetorPosicao[i]);
            }
        }
    }
}
