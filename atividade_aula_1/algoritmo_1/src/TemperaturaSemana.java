import java.util.Scanner;

public class TemperaturaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperature[] = new double[7];
        String diasSemana[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        int i = 0;
        int count = 0;
        double total = 0;

        for (i = 0; i < temperature.length; i++) {
            System.out.print("Digite a temperatura na " + diasSemana[i] + ": ");
            temperature[i] = sc.nextInt();

            total += temperature[i];
        }

        double media = total / i;

        for (i = 0; i < temperature.length; i++) {
            if (temperature[i] > media) {
                count++;
            }
        }

        System.out.println("\nDias da semana com temperaturas acima da média: " + count);
    }
}
