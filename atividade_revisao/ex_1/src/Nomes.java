import java.util.Scanner;

public class Nomes {

    static class Aluno {
        public double nota;
        public String nome;
    }

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];

        double media = read(alunos);
        print(alunos, media);
    }

    public static double read(Aluno alunos[]) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double total = 0;
        int i = 0;

        for (i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();
            alunos[i] = aluno;

            System.out.print("Digite seu nome: ");
            alunos[i].nome = sc.next();

            System.out.print("Digite sua nota: ");
            alunos[i].nota = sc.nextDouble();

            total += alunos[i].nota;
        }

        return media = total / i;
    }

    public static void print(Aluno[] alunos, double media) {
        System.out.println("\n" + "Media: " + media);
        System.out.println("| Nome " + " | " + " Nota |");
        for (Aluno aluno: alunos) {
            if (aluno.nota > media) {
                System.out.println("      " + aluno.nome + " | " + aluno.nota);
            }
        }
    }
}
