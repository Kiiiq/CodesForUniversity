package QuestaoSala1;

public class Triangulo {

    private double lado1,lado2, lado3;

    public Triangulo(double lado1,double lado2,double lado3){
        if (lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado2+lado1) {
            this.lado1=lado1;
            this.lado2=lado2;
            this.lado3=lado3;
        } else {
            this.lado1=5;
            this.lado2=4;
            this.lado3=3;
        }
    }

    public Triangulo(double lado){
        lado1=lado;
        lado2=lado;
        lado3=lado;
    }

    public Triangulo(double lado1,double lado2e3 ){
        this.lado1=lado1;
        lado2=lado2e3;
        lado3=lado2e3;
    }


    public double getPerimetro(){
        return lado1+lado2+lado3;
    }

    public double getArea(){
        double media,s=getPerimetro()/2;
        media=Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return media;
    }
}
