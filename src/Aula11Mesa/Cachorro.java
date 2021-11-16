package Aula11Mesa;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + " latiu");
    }

    public void correr(){
        System.out.println(getNome() + " correu com uma velocidade média");
    }
}
