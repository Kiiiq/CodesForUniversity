package Figuras;

public class Retangulo {
    double x, y, largura, comprimento;

    public double perimetro(){
        return 2*(largura+comprimento);
    }

    public double area(){
        return largura*comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
