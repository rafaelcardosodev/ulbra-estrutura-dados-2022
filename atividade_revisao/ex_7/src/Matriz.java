import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        int tam = 5;
        int[] numbers = new int[tam];

        read(numbers);
        //findMediana(numbers, tam);
        findModa(numbers);
    }

    public static void read(int[][] numbers) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("Digite um valor");
                numbers[i][j] = sc.nextInt();
            }
        }
    }

    public static void read(int[] numbers) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite um valor");
            numbers[i] = sc.nextInt();
        }
    }

    public static void findMediana(int[][] numbers, int tam) {
        int[] arrayNumbers = new int[numbers.length* numbers.length];
        int k = 0;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                arrayNumbers[k] = numbers[i][j];
                k++;
            }
        }

        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = 0; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] > arrayNumbers[j]) {
                    int temp = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[i];
                    arrayNumbers[i] = temp;
                }
            }
        }

        System.out.println("Mediana: " + arrayNumbers[arrayNumbers.length/2]);
    }

    public static void findModa(int[][] numbers) {
        int k = 0;
        int l = 0;
        int count = 0;
        int moda = 0;
        int itemModa = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                while (k < numbers.length) {
                    while (l < numbers.length) {
                        if (numbers[i][j] == numbers[k][l]) {
                            count++;
                        }
                        l++;
                    }
                    k++;
                }
                if (count > moda) {
                    moda = count;
                    itemModa = numbers[i][j];
                }
            }
        }

        System.out.println("Frequência: " + moda);
        System.out.println("Valor: " + itemModa);
    }

    public static void findModa(int[] numbers) {
        int j = 0;
        int count = 0;
        int moda = 0;
        int itemModa = 0;

        for (int i = 0; i < numbers.length; i++) {
            while (j < numbers.length) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
                j++;
            }
            if (count > moda) {
                moda = count;
                itemModa = numbers[i];
            }
        }

        System.out.println("Frequência: " + moda);
        System.out.println("Valor: " + itemModa);
    }
}
