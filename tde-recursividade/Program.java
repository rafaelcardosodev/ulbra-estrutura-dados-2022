public class Program {
    public static void main(String[] args) {
        int[] numbers = {1, 212, 22, 3, 10};
        System.out.println(Recursion.sum(numbers, numbers.length - 1));
        System.out.println(Recursion.findMax(numbers, numbers.length - 1));
    }
}
