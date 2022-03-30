import java.util.Scanner;

public class Program {

    static class Aluno {
        String nome;
        double g1;
        double g2;

        public Aluno(double g1, double g2, String nome) {
            this.nome = nome;
            this.g1 = g1;
            this.g2 = g2;
        }
    }

    public static void main(String[] args) {
        Aluno[][] alunos = new Aluno[2][2];

        read(alunos);
        write(alunos);
    }

    public static void read(Aluno alunos[][]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < alunos.length; j++) {
                System.out.println("Digite seu nome");
                String nome = sc.next();

                System.out.println("Digite a primeira nota");
                double g1 =  sc.nextDouble();
                while (g1 > 10 || g1 < 0) {
                    System.out.println("Digite uma nota válida");
                    g1 = sc.nextDouble();
                }
                System.out.println("Digite a segunda nota");
                double g2 =  sc.nextDouble();
                while (g2 > 10 || g2 < 0) {
                    System.out.println("Digite uma nota válida");
                    g2 = sc.nextDouble();
                }

                Aluno aluno = new Aluno(g1, g2, nome);
                alunos[i][j] = aluno;

            }
        }
    }

    public static void write(Aluno alunos[][]) {
        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < alunos.length; j++) {
                double media = (alunos[i][j].g1 + alunos[i][j].g2) * 2 / 3;
                String situacao = isAprovado(media);
                System.out.println("Aluno: " + alunos[i][j].nome
                + " | Nota 1: " + alunos[i][j].g1
                + " | Nota 2: " + alunos[i][j].g2
                + " | Média: " + media
                + " | Situação: " + situacao);
            }
        }
    }

    public static String isAprovado(double media) {
        if (media >= 7) {
            return "APROVADO";
        } else if (media >= 6 ){
            return "EM EXAME";
        } else {
            return "REPROVADO";
        }
    }
}
