import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List strings = new List();
        Scanner sc = new Scanner(System.in);
        int option = 99;
        do {
            System.out.print("\nSELECT AN OPERATION: \n" +
                    "1 - ADD ELEMENT ON LIST'S START\n" +
                    "2 - ADD ELEMENT ON LIST'S ENDING\n" +
                    "3 - SHOW LIST\n" +
                    "4 - SHOW LIST'S FIRST ELEMENT\n" +
                    "5 - SHOW LIST'S LAST ELEMENT\n" +
                    "6 - REMOVE FIRST ELEMENT\n" +
                    "7 - REMOVE LAST ELEMENT\n" +
                    "8 - REMOVE FROM VALUE\n" +
                    "9 - REMOVE FROM POSITION\n" +
                    "10 - SEARCH FOR VALUE\n" +
                    "11 - COUNT ALL VALUE THAT MATCH\n" +
                    "12 - REMOVE ALL VALUES THAT MATCH\n" +
                    "13 - PRINT LIST REVERSED\n" +
                    "0 - EXIT\n" +
                    ": ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Write a value: ");
                    Node nodeAddStart = new Node(sc.next());
                    strings.addStart(nodeAddStart);
                    break;
                case 2:
                    System.out.print("Write a value: ");
                    Node nodeAddEnd = new Node(sc.next());
                    strings.addEnd(nodeAddEnd);
                    break;
                case 3:
                    strings.print(strings.start);
                    break;
                case 4:
                    strings.printFirstElement();
                    break;
                case 5:
                    strings.printLastElement();
                    break;
                case 6:
                    strings.removeFromStart();
                    break;
                case 7:
                    strings.removeFromEnd();
                    break;
                case 8:
                    System.out.print("TYPE VALUE TO BE REMOVED: ");
                    strings.removeFromValue(sc.next());
                    break;
                case 9:
                    System.out.print("TYPE A POSITION TO REMOVE: ");
                    strings.removeFromPosition(sc.nextInt());
                    break;
                case 10:
                    System.out.print("TYPE A VALUE TO SEARCH FOR: ");
                    strings.search(sc.next());
                    break;
                case 11:
                    System.out.print("TYPE A VALUE TO COUNT MATCHES: ");
                    strings.searchMatches(sc.next());
                    break;
                case 12:
                    System.out.print("TYPE A VALUE TO BE REMOVED (ALL MATCHES WILL BE ERASED): ");
                    strings.removeAllFromValue(sc.next());
                    break;
                case 13:
                    strings.printReversed();
                    break;
            }
        } while (option != 0);
    }
}
