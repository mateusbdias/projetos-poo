package Aula11Mesa;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + " relinchou");
    }

    public void correr(){
        System.out.println(getNome() + " correu com uma velocidade alta");
    }
}
