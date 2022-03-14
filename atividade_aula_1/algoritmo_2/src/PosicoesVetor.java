import java.util.Scanner;

public class PosicoesVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vetor[] = new double[5];
        int option = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor para o vetor: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println("Deseja continuar?\n0 para NÃO\nCaso SIM\n1 - para mostrar o vetor em ordem direta\n2 - para mostrar o vetor em ordem inversa");
        option = sc.nextInt();

        switch(option) {
            case 0:
                break;
            case 1:
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println(vetor[i]);
                }
                break;
            case 2:
                for (int i = (vetor.length - 1); i >= 0; i--) {
                    System.out.println(vetor[i]);
                }
                break;
        }
    }
}
