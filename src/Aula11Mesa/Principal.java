package Aula11Mesa;

public class Principal {
    public static void main(String[] args){
        Cachorro bidu = new Cachorro("Bidu", 5);
        bidu.emitirSom();
        bidu.correr();

        Preguica flash = new Preguica("Flash", 15);
        flash.subirArvores();
        flash.emitirSom();

        Cavalo spirit = new Cavalo("Spirit", 3);
        spirit.correr();
        spirit.emitirSom();
    }
}
