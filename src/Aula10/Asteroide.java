package Aula10;

public class Asteroide extends Objeto{
    private int danos;

    public Asteroide(int x, int y, char direcao, int danos){
        super(x, y, direcao);
        this.danos = danos;
    }

    public int getDanos() {
        return danos;
    }

    public void setDanos(int danos) {
        this.danos = danos;
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "posX=" + super.getPosX() +
                ", posY=" + super.getPosY() +
                ", direcao=" + super.getDirecao() +
                ", danos=" + danos +
                '}';
    }
}
