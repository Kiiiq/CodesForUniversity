package Escola;

import java.util.Random;

public class Aluno {
    Random random = new Random();
    private double nota1, nota2, notaTrabalho;
    private String nome;
    int matricula;

    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1= random.nextDouble()*10;
        this.nota2= random.nextDouble()*10;
        this.notaTrabalho = random.nextDouble()*10;
        System.out.println(nota1+" " +nota2+" "+notaTrabalho);
    }

//#region Setters & Getters 
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNotaTrabalho() {
        return notaTrabalho;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double media(){
        return (((nota1+nota2)*2.5)+(notaTrabalho*2))/7;
    }

}
