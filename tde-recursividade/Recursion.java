public interface Recursion {

    static int sum(int[] array, int index) {
        int sum = 0;
        if (index < 0) {
            return 0;
        }
        sum += array[index] + sum(array, index - 1 );
        return sum;
    }

    static int findMax(int[] array, int index) {
        if (index == 1) {
            return array[0];
        }
        return Math.max(array[index-1], findMax(array, index-1));
    }

}
