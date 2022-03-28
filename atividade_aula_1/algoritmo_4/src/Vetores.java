import java.util.Scanner;

public class Vetores {
    public static final int QUANTITY = 10;

    public static int[] createVetor(int arraySize) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Digite um valor para o vetor: ");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static void printArray(int array[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        int indexC = 0;
        int indexD = 0;
        int i = 0;

        //original arrays
        int arrayA[] = Vetores.createVetor(QUANTITY);
        System.out.println("===========================");
        int arrayB[] = Vetores.createVetor(QUANTITY/2);

        //resultant arrays
        int arrayC[] = new int[QUANTITY*2];
        int arrayD[] = new int[QUANTITY*2];

        for (i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 == 0) {
                arrayC[indexC] = arrayA[i];
                indexC++;
            } else if (arrayA[i] % 2 == 1){
                arrayD[indexD] = arrayA[i];
                indexD++;
            }
        }

        for (i = 0; i < arrayC.length; i++) {

        }

        printArray(arrayC, arrayC.length);
    }
}
