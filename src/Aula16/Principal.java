package Aula16;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mateus", "Dias",
                "123456", 200);
        try {
            cliente.comprar(500);
        } catch(ClienteException e){
            System.err.println(e);
        }
    }
}
