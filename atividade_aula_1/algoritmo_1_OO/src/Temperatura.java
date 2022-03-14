import java.util.Scanner;

public class Temperatura {

    public int count;
    public double total;
    public double media;
    public static int DIAS = 7;

    public void read(double temperature[]) {
        Scanner sc = new Scanner(System.in);

        String diasSemana[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Digite a temperatura na " + diasSemana[i] + ": ");
            temperature[i] = sc.nextInt();

            total += temperature[i];
        }
    }

    public double calculateMedia() {
        media = total / DIAS;
        return media;
    }

    public int countDays(double temperature[]) {
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > media) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        double temperature[] = new double[DIAS];
        Temperatura temp = new Temperatura();
        temp.read(temperature);
        temp.calculateMedia();

        System.out.println("\nDias da semana com temperaturas acima da média: " + temp.countDays(temperature));

    }
}
