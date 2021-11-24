package Aula15;

import java.util.ArrayList;

public class Iate extends Embarcacao implements Comparable<Iate> {
    private ArrayList<Cabine> listaCabines = new ArrayList<>();

    public Iate(double precoBase, double valorAdicional, int anoFab, double comprimento) {
        super(precoBase, valorAdicional, anoFab, comprimento);
    }

    public void addCabine(Cabine cabine){
        this.listaCabines.add(cabine);
    }

    @Override
    public int compareTo(Iate o){
        if (this.listaCabines.size() == o.listaCabines.size()) {
            return 0;
        } else if (this.listaCabines.size() > o.listaCabines.size()) {
            return 1;
        } else {
            return -1;
        }
    }
}
