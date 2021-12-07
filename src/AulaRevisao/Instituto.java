package AulaRevisao;

import java.util.ArrayList;

public class Instituto {
    private String nome;
    private ArrayList<OfertaAcad> listaOfertas = new ArrayList<>();

    public Instituto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addOferta(OfertaAcad oferta){
        listaOfertas.add(oferta);
    }

    public void listarOfertas(){
        for(OfertaAcad oferta: listaOfertas){
            System.out.println(oferta.getNome() + " - Preço: R$ " + oferta.calcularPreco());
        }
    }
}
