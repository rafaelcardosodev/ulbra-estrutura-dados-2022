import java.util.ArrayList;

public class Sort {
    public static void cocktailSort(int[] array) {
        int counter = 0;
        int comparisons = 0;
        int swifts = 0;

        double startTime = System.nanoTime();
        while (counter < array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int oldValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = oldValue;
                    swifts++;
                }
                comparisons++;
            }

            for (int i = array.length; i > array.length - 1; i--) {
                if (array[i - 1] > array[i]) {
                    int oldValue = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = oldValue;
                    swifts++;
                }
                comparisons++;
            }
            counter++;
        }
        double endTime = System.nanoTime();
        double timer = (endTime - startTime)/1000000;
        ArrayFactory.printArray(array, comparisons, swifts, timer);
    }

    public static void bubbleSort(int[] array) {
        int comparisons = 0;
        int swifts = 0;

        double startTime = System.nanoTime();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int value = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = value;
                    swifts++;
                }
                comparisons++;
            }
        }
        double endTime = System.nanoTime();
        double timer = (endTime - startTime)/1000000;
        ArrayFactory.printArray(array, comparisons, swifts, timer);
    }

    public static void insertSort(int array[]) {
        int n = array.length;
        int comparisons = 0;
        int swifts = 0;

        double startTime = System.nanoTime();
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                swifts++;
            }
            comparisons++;
            array[j + 1] = key;
            swifts++;
        }

        double endTime = System.nanoTime();
        double timer = (endTime - startTime)/1000000;
        ArrayFactory.printArray(array, comparisons, swifts, timer);
    }
}
