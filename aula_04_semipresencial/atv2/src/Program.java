import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int matriz[][] = new int[2][2];
        buildMatriz(matriz);
        String option = "a";

        while (option.toLowerCase() != "e") {
            switch (option.toLowerCase()) {
                case "a":
                    addElement(matriz, row, column);
                    break;
                case "b":
                    removeElement(matriz, row, column);
                    break;
                case "c":
                    cleanMatriz(matriz);
                    break;
                case "d":
                    showMatriz(matriz);
                    break;
            }
        }
    }

    public static void buildMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 0;
            }
        }
    }



    public static void showMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }
}
