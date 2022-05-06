public class ArrayFactory {

    public static int[] generateArray(int length) {
        int array[] = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * length);
        }

        return array;
    }
    public static void printArray(int[] array, int comparisons, int swifts, double timer) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println(" }");
        System.out.println("Total comparisons: " + comparisons);
        System.out.println("Total swifts: " + swifts);
        System.out.println("Timer: " + timer + " ms");
    }
}
