package Aula14;

import java.util.ArrayList;
import java.util.Collections;

public class Porto {
    private String nome;
    private ArrayList<Container> listaContainers = new ArrayList<>();

    public Porto(String nome) {
        this.nome = nome;
    }

    public void addContainer(Container container){
        listaContainers.add(container);
    }

    public void orderContainers(){
        Collections.sort(listaContainers);

        for (Container container: listaContainers) {
            System.out.println("Container ID: " + container.getNumID() + "\nPaís: " + container.getPaisOrigem()
                    + "\nDescrição: " + container.getDescricao() + "\nMateriais Perigosos: " + container.isMatPerigosos()
                    + "\n===============");
        }
    }

    public int getQuantidadeContainersPerigosos(){
        int contador = 0;
        for (Container container: listaContainers) {
            if (container.getPaisOrigem().matches("Desconhecido") && container.isMatPerigosos()){
                contador++;
            }
        }
        return contador;

    }
}
