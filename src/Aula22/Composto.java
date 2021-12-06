package Aula22;

import java.util.ArrayList;

public class Composto extends Figura{
    private ArrayList<Figura> listaFiguras = new ArrayList<>();

    public Composto(String nome) {
        super(nome);
    }

    public void inserirFigura(Figura figura){
        listaFiguras.add(figura);
    }

    public void mostrarFiguras(){
        for(Figura figura: listaFiguras){
            System.out.println(figura.getNome());
        }
    }

    public double calcularArea(){
        double area = 0;
        for(Figura figura: listaFiguras){
            area += figura.calcularArea();
        }
        return area;
    }
}
