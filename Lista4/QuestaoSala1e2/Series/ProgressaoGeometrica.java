package Series;

import java.util.Scanner;

public class ProgressaoGeometrica {
    private int razao, priTermo, termAtual;


    public ProgressaoGeometrica(int razao,int priTermo){
        this.razao=razao;
        this.priTermo=priTermo;
        termAtual=this.priTermo;
    }

    public ProgressaoGeometrica(Scanner sc){
        
        System.out.println("Digite a razao da Progressao Geometrica:");
        this.razao=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o primeiro termo da Progressao Geometrica:");
        this.priTermo=sc.nextInt();
        sc.nextLine();

        termAtual= this.priTermo;
    }
    
    public int gerarPG(){
        int temp= termAtual;
        termAtual*=razao;
        return temp;
    }

//--------------------------------------- GETTERS E SETTERS ----------------------------------------

    public int getTermoAtual(){
        return termAtual;
    }

    public void setRazao(int novoValor){
        this.razao=novoValor;
    }

    public void setPriTermo(int novoValor){
        this.priTermo=novoValor;
    }

    public int getRazao(){
        return this.razao;
    }

    public int getPriTermo(){
        return this.priTermo;
    }
}
