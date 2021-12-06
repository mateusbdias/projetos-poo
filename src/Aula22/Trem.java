package Aula22;

import java.util.ArrayList;

public class Trem {
    private ArrayList<Figura> figuras = new ArrayList<>();

    public void adicionarFigura(Figura figura){
        figuras.add(figura);
    }

    public void mostrarFiguras(){
        for(Figura figura: figuras){
            System.out.println(figura.getNome());
        }
    }

    public double areaTotal(){
        double areaTotal = 0;
        for(Figura figura: figuras){
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
}
