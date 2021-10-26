package Aula02;

public class Funcoes {
    static boolean numeroDivisivel(int num1, int num2, int resto){
        resto = num1 % num2;
        if(resto == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(numeroDivisivel(30, 4, 0));
        System.out.println(numeroDivisivel(28, 4, 0));
    }
}
