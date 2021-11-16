package Aula11Mesa;

public class Preguica extends Animal{
    public Preguica(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + " resmungou");
    }

    public void subirArvores(){
        System.out.println(getNome() + " subiu na árvore");
    }
}
