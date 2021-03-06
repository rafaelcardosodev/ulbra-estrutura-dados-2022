import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        buildMatrix(matrix);
        String option = "";

        while (option.toLowerCase() != "s") {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a opção que deseja realizar \n" +
                    "A - Adicionar elemento\n" +
                    "R - Remover elemento\n" +
                    "L - Limpar matriz\n" +
                    "M - Mostrar matriz\n" +
                    "opção: ");
            option = sc.next();
            switch (option.toLowerCase()) {
                case "a":
                    addElement(matrix);
                    break;
                case "r":
                    removeElement(matrix);
                    break;
                case "l":
                    clearMatrix(matrix);
                    break;
                case "m":
                    showMatrix(matrix);
                    break;
            }
        }
    }

    public static boolean addElement(int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a posição que deseja inserir (linha x coluna): ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        if (row > matrix.length || column > matrix.length) {
            System.out.println("Indíces de matriz inválidos");
            return false;
        }
        String option = "sim";
        if (matrix[row][column] != 0) {
            System.out.print("Deseja sobrescrever o valor? (sim/nao): ");
            option = sc.next();
        }
        if (option.equals("sim")) {
            System.out.print("Digite o valor que deseja inserir: ");
            matrix[row][column] = sc.nextInt();
        }
        return true;
    }

    public static boolean removeElement(int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a posição que deseja remover (linha x coluna): ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        if (row > matrix.length || column > matrix.length) {
            System.out.println("Indíces de matriz inválidos");
            return false;
        }

        matrix[row][column] = 0;
        return true;
    }

    public static void clearMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix.length; y++) {
                matrix[i][y] = 0;
            }
        }
    }

    public static void buildMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public static void showMatrix(int matrix[][]) {
        for(int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix.length; y++) {
                System.out.print(" | " + matrix[i][y]);
            }
            System.out.println(" |");
        }
    }
}
