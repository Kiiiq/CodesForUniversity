package Series;

public class Fibonacci {
    int termo1=1, termo2=0, temp=0;

    public int gerarFibonacci(){
        temp= termo1;
        termo1+=termo2;
        termo2=temp;
        return temp;
    }
}
