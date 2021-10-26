package Aula02;

import java.util.Scanner;

public class ExScanner {
    public static void main(String[] args){
        Scanner scanner;
        scanner = new Scanner(System.in);

        String nome;
        String sobrenome;
        char inicialNome;
        char inicialSobrenome;

        System.out.println("Insira o nome:");
        nome = scanner.nextLine();
        System.out.println("Insira o sobrenome:");
        sobrenome = scanner.nextLine();
        inicialNome = nome.charAt(0);
        inicialSobrenome = sobrenome.charAt(0);

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Iniciais: " + inicialNome + inicialSobrenome);
    }
}
