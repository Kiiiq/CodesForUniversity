package Escola;

public class Turma {
    String disciplina, professor;
    Aluno[] alunos = new Aluno[30];
    int cargaHoraria, qntdAlunos=0;

    public Turma(String disciplina, String professor, int cargaHoraria){
        this.cargaHoraria= cargaHoraria;
        this.disciplina= disciplina;
        this.professor= professor;
    }

    public void inserirAluno(String nome){
        alunos[qntdAlunos] = new Aluno(qntdAlunos, nome);
        qntdAlunos++;
    }

    public double mediaDaTurma(){
        double soma=0;
        for (int i = 0; i < qntdAlunos; i++) {
            soma+=alunos[i].media();
        }
        return soma/qntdAlunos;
    }

    public void listarAlunos(){
        for (int i = 0; i < qntdAlunos; i++) {
            System.out.println(alunos[i].getNome());
        }
    }

    public Aluno getAluno(int i){
        return alunos[i];
    }

    public int getQntd(){
        return qntdAlunos;
    }

    
}
