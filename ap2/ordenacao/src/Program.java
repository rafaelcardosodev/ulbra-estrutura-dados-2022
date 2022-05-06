public class Program {
    public static void main(String[] args) {
        int length = 10000;
        //int[] numbers = ArrayFactory.generateArray(length);
        int[] numbers = {2, 4, 6, 7, 9, 3, 1, 0, 5, 8};

        //Sort.bubbleSort(numbers);
        //Sort.cocktailSort(numbers);
        Sort.insertSort(numbers);
    }
}
