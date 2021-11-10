package Aula10;

public class Nave extends Objeto {
    private double velocidade;
    private int vida;

    public Nave(int x, int y, char direcao, double velocidade){
        super(x, y, direcao);
        this.velocidade = velocidade;
        this.vida = 100;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "posX=" + super.getPosX() +
                ", posY=" + super.getPosY() +
                ", direcao=" + super.getDirecao() +
                ", velocidade=" + velocidade +
                ", vida=" + vida +
                '}';
    }

    @Override
    public void irA(int x, int y, char direcao) {
        if (direcao != super.getDirecao()) {
            this.girar(direcao);
        }
        super.irA(x, y, direcao);
    }

    public void girar(char direcao){
        super.setDirecao(direcao);
    }

    public void restaVida(int valor){
        this.vida -= valor;
    }
}
