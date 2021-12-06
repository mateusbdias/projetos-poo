package Aula22;

public class Retangulo extends Figura{
    private double altura;
    private double largura;

    public Retangulo(String nome, double altura, double largura) {
        super(nome);
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calcularArea(){
        return this.altura * this.largura;
    }
}
