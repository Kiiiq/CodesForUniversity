package Questao1;

public class ProgressaoAritimetica {
    int razao, priTermo, termAtual;


    public ProgressaoAritimetica(int razao,int priTermo){
        this.razao=razao;
        this.priTermo=priTermo;
        termAtual=this.priTermo;
    }
    
    public void gerarPA(){
        System.out.println(termAtual);
        termAtual+=razao;
    }
}
