package Figuras;

public class Circulo {
    double x, y, raio;

    public double perimetro(){
        return 2*Math.PI*raio;
    }

    public double area(){
        return Math.PI*raio*raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
}
