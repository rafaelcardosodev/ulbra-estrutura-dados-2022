import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List numbers = new List();
        Scanner sc = new Scanner(System.in);

        int option = 99;
        do {
            System.out.print("\nSELECT AN OPERATION: \n" +
                    "1 - ADD ELEMENT ON LIST'S START\n" +
                    "2 - ADD ELEMENT ON LIST'S ENDING\n" +
                    "3 - SHOW LIST\n" +
                    "4 - SHOW LIST'S FIRST ELEMENT\n" +
                    "5 - SHOW LIST'S LAST ELEMENT\n" +
                    "0 - EXIT\n" +
                    ": ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Write a number: ");
                    Node nodeAddStart = new Node(sc.nextInt());
                    numbers.addStart(nodeAddStart);
                    break;
                case 2:
                    System.out.print("Write a number: ");
                    Node nodeAddEnd = new Node(sc.nextInt());
                    numbers.addEnd(nodeAddEnd);
                    break;
                case 3:
                    numbers.showList(numbers.start);
                    break;
                case 4:
                    numbers.showFirstElement(numbers);
                    break;
                case 5:
                    numbers.showLastElement(numbers);
                    break;
            }
        } while (option != 0);
    }
}
