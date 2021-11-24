package Aula15;

import java.util.ArrayList;

public class Veleiro extends Embarcacao implements Avaliar {
    private ArrayList<Mastro> listaMastros = new ArrayList<>();

    public Veleiro(double precoBase, double valorAdicional, int anoFab, double comprimento) {
        super(precoBase, valorAdicional, anoFab, comprimento);
    }

    public void addMastro(Mastro mastro){
        this.listaMastros.add(mastro);
    }

    public boolean avaliar(){
        if (this.listaMastros.size() > 4) {
            return true;
        } else {
            return false;
        }
    }
}
