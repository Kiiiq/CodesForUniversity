package Questao3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Aluno aluno = registrarAluno();

        aluno.media(aluno.notap1,aluno.notap2,aluno.notat);
        aluno.provaFinal(aluno.media);

    }

    public static Aluno registrarAluno() {
        Scanner scanner = new Scanner(System.in);
        double notap1, notap2, notat;
        String matricula, nome;
        Aluno aluno;

        System.out.println("Digite o nome do aluno:");
        nome=scanner.nextLine();
        
        System.out.println("Digite a matricula do aluno:");
        matricula=scanner.nextLine();

        System.out.println("Digite a nota da prova 1");
        notap1=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a nota da prova 2");
        notap2=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a nota do trabalho");
        notat=scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        aluno= new Aluno(matricula, nome, notap1, notap2, notat);
        return aluno;
    }
}
