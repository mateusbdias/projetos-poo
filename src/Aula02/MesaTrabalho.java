package Aula02;

public class MesaTrabalho {
    static boolean numeroPrimo(int numero) {
        for (int i = 2; i < numero; i++){
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(numeroPrimo(13));
    }
}
