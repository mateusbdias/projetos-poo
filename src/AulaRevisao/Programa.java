package AulaRevisao;

import java.util.ArrayList;

public class Programa extends OfertaAcad{
    private ArrayList<OfertaAcad> listaCursos = new ArrayList<>();
    private double desconto;

    public Programa(){}
    public Programa(String nome, String descricao, double desconto) {
        super(nome, descricao);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void addCurso(OfertaAcad curso){
        listaCursos.add(curso);
    }

    public void listarCursos(){
        for(OfertaAcad curso: listaCursos){
            System.out.println(curso.getNome());
        }
    }

    public double calcularPreco(){
        double subtotal = 0;
        for(OfertaAcad curso: listaCursos){
            subtotal += curso.calcularPreco();
        }
        return subtotal * (1 - desconto);
    }
}
