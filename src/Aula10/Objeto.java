package Aula10;

public class Objeto {
    private int posX;
    private int posY;
    private char direcao;

    public Objeto(int x, int y, char direcao){
        this.posX = x;
        this.posY = y;
        this.direcao = direcao;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", direcao=" + direcao +
                '}';
    }

    public void irA(int x, int y, char direcao){
        if (direcao == 'N' || direcao == 'S') {
            this.posY = y;
        } else if (direcao == 'L' || direcao == 'O') {
            this.posX = x;
        } else {
            System.out.println("Informe uma direção válida!");
        }
        this.direcao = direcao;
    }
}
