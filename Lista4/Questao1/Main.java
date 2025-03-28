import java.util.Scanner;

import Escola.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Turma turma;
    private static Aluno alunoTemp;
    private static int intTemp;
    
    public static void main(String[] args) {

        iniciarTurma();
        
        while (intTemp!=7) {
            painelDeEscolha();
        }

        scanner.close();
    }

    static void iniciarTurma(){
        String disciplina, professor; 
        int cargaHoraria;
        
        System.out.println("Digite o nome da Disciplina:");
        disciplina= scanner.nextLine();

        System.out.println("Digite o nome do Professor:");
        professor= scanner.nextLine();

        System.out.println("Digite a Carga Horaria da materia");
        cargaHoraria = scanner.nextInt();
        scanner.nextLine();

        turma= new Turma(disciplina, professor, cargaHoraria);
    }

    static void painelDeEscolha(){
        

        System.out.println("\n\n\n\n");
        System.out.println( "O que deseja fazer?\n");
        System.out.println( "1- Inserir Aluno \n" + 
                            "2- Definir nota 1 de aluno\n" +
                            "3- Definir nota 2 de aluno\n" + 
                            "4- Definir nota de Trabalho de Aluno\n"+
                            "5- Calcular média da turma\n" + 
                            "6- Mostrar Listagem de Alunos\n"+
                            "7- Sair");
        
        intTemp=scanner.nextInt();
        scanner.nextLine();
        
        switch (intTemp) {
            case 1:
                registrarAluno();
                break;

            case 2:
                definirNota(1,buscarAluno());
                break;

            case 3:
                definirNota(2,buscarAluno());
                break;

            case 4:
                definirNota(3,buscarAluno());
                break;

            case 5:
                System.out.println("A media da turma é " + turma.mediaDaTurma());
                break;

            case 6:
                turma.listarAlunos();
                break;

            case 7:
                break;
            
            default:
                    System.out.println("Opcao invalida tente novamente");
                break;
            }

    
    }

    static void registrarAluno(){
        System.out.println("\n\nDigite o nome do Aluno a ser inserido na turma:");
        turma.inserirAluno(scanner.nextLine());
        alunoTemp = turma.getAluno(turma.getQntd()-1);
        System.out.println("O aluno " + alunoTemp.getNome() + " foi registrado com o numero de matricula " + alunoTemp.getMatricula());
    }

    static int buscarAluno(){
        int check = 0;
        while (check==0) {
            System.out.println("\n\nDigite o numero de matricula do aluno a ter a nota atribuida");
            intTemp=scanner.nextInt();
            scanner.nextLine();

            alunoTemp=turma.getAluno(intTemp);
            System.out.println("Aluno:" + alunoTemp.getNome() + "\n Esse é o aluno desejado? (digite 0 para trocar ou qualquer outro numero para continuar)");
            check=scanner.nextInt();
            scanner.nextLine();
        }

        return alunoTemp.getMatricula();
    }

    static void definirNota(int i, int matricula){
        double nota;
        System.out.println("Digite a nota para dar ao aluno " + turma.getAluno(matricula).getNome());
        nota= scanner.nextDouble();
        scanner.nextLine();

        if (i==1) {
            turma.getAluno(matricula).setNota1(nota);
        } else if (i == 2) {
            turma.getAluno(matricula).setNota2(nota);
        } else {
            turma.getAluno(matricula).setNotaTrabalho(nota);
        }
    }

    
}
