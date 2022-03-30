public class Program {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        int qtd = 0;

        qtd = add(vetor, qtd, 8);
        qtd = add(vetor, qtd, 8);
        qtd = add(vetor, qtd, 8);

        mostrarVetor(vetor, qtd);
    }

    public static void mostrarVetor(int vetor[], int size) {
        if (vetor.length == 0) {
            System.out.println("Vetor vazio");
        }
        if (size > vetor.length) {
            System.out.println("O vetor não possui tamanho suficiente");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(vetor[i]);
            }
        }
    }

    public static int add(int vetor[], int size, int valor) {
        if (size <= vetor.length) {
            vetor[size] = valor;
            size++;
        } else {
            System.out.println("Vetor vazio");
        }
        return size;
    }

    public static int addInicio(int vetor[], int size, int valor) {
        if (size < vetor.length) {
            System.out.println("Inicial");

            for (int i = size; i > 0; i--) {
                System.out.println("Posição: " + i + vetor[i - 1]);
                vetor[i] = vetor[i - 1];
            }

            System.out.println("fim");
            vetor[0] = valor;
            size++;
        } else {
            System.out.println("Vetor cheio");
        }
        return size;
    }
}
