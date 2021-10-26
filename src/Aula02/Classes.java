package Aula02;

public class Classes {
    public static void main(String[] args) {
        String texto1 = "Este é um texto";
        String texto2 = "Este é um texto";

        if(texto1.equals(texto2)){
            System.out.println("Os textos são iguais");
        } else {
            System.out.println("Os textos são diferentes");
        }

        Integer valor1 = 23;
        Integer valor2 = 34;
        int comparar;

        if(valor1.equals(valor2)){
            System.out.println("Os números são iguais");
        } else {
            comparar = valor1.compareTo(valor2);
            if(comparar > 0){
                System.out.println("O primeiro número é maior");
            } else {
                System.out.println("O segundo número é maior");
            }
        }
    }
}
