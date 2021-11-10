package Aula10;

public class PrincipalMesa {
    public static void main(String[] args){
        Nave nave1 = new Nave(10, 10, 'N', 20);

        nave1.irA(20, 20, 'L');

        System.out.println(nave1);

        Asteroide asteroide1 = new Asteroide(30, 30, 'L', 15);

        asteroide1.irA(20, 20, 'O');

        System.out.println(asteroide1);
    }
}
