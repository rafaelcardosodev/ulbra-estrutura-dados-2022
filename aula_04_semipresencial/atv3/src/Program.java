import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Car matrix[][] = new Car[2][2];
        buildMatrix(matrix);
        String option = "a";

        while (option.toLowerCase() != "s") {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a opção que deseja realizar \n" +
                    "A - Adicionar um carro\n" +
                    "R - Remover um carro\n" +
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

    public static boolean addElement(Car[][] matrix) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a posição que deseja inserir (linha x coluna): ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        if (row > matrix.length || column > matrix.length) {
            System.out.println("Indíces de matriz inválidos");
            return false;
        }

        String option = "sim";
        if (matrix[row][column] != null) {
            System.out.print("Deseja sobrescrever o valor? (sim/nao): ");
            option = sc.next();
        }
        if (option.equals("sim")) {
            Car car = buildCar();
            matrix[row][column] = car;
        }

        return true;
    }

    public static Car buildCar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a placa do carro: ");
        String licensePlate = sc.next();
        System.out.print("Digite o modelo do carro: ");
        String model = sc.next();
        System.out.print("Digite a cor do carro: ");
        String color = sc.next();

        return new Car(licensePlate, model, color);
    }

    public static boolean removeElement(Car[][] matrix) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a posição que deseja remover (linha x coluna): ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        if (row > matrix.length || column > matrix.length) {
            System.out.println("Indíces de matriz inválidos");
            return false;
        }

        matrix[row][column] = null;
        return true;
    }

    public static void clearMatrix(Car[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix.length; y++) {
                matrix[i][y] = null;
            }
        }
    }

    public static void buildMatrix(Car matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = null;
            }
        }
    }

    public static void showMatrix(Car matrix[][]) {
        for(int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix.length; y++) {
                if (matrix[i][y] != null) {
                    System.out.print(" | " + matrix[i][y].toString());
                } else {
                    System.out.print(" | " + matrix[i][y]);
                }
            }
            System.out.println(" |");
        }
    }
}
