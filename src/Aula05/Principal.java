package Aula05;

public class Principal {
    public static void main(String[] args){
        Cliente cliente = new Cliente(123, "Diego");
        System.out.println(cliente.getNome());
        cliente.aumentarDivida(100);
        cliente.pagarDivida(10);
        System.out.println(cliente.getDivida());
    }
}
