package Questao3;

public class Aluno {
    double notap1, notap2, notat, media;
    String matricula, nome;

    public Aluno(String matricula, String nome, double notap1, double notap2, double notat){
        this.notap1= notap1;
        this.notap2= notap2;
        this.notat = notat;
        this.matricula= matricula;
        this.nome = nome;
    }

    public double media(double notap1, double notap2, double notat){
        media=(((notap1+notap2)*2.5)+(notat*2))/7;
        System.out.println(String.format("%.2f",media));
        return media;
    }

    public double provaFinal(double media){
        if (media>=6) {
            System.out.println("O aluno nao vai pra prova final");
            return 0;
        } else {
            System.out.println("O aluno precisa de " + String.format("%.2f",12-media) + " pontos para passar");
            return 12-media;
        }
    }
} 


