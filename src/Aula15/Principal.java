package Aula15;

public class Principal {
    public static void main(String[] args) {
        Capitao capitao1 = new Capitao("Mario", "Fragata", 13579);
        Capitao capitao2 = new Capitao("Herman", "Ahab", 24680);

        Veleiro veleiro1 = new Veleiro(3550.80, 0, 2018, 4.5);
        Iate iate1 = new Iate(8430.50, 1000, 2021, 6.5);
        Iate iate2 = new Iate(12345, 0, 2020, 8.5);

        Mastro mastro1 = new Mastro(3);
        Mastro mastro2 = new Mastro(3);

        Cabine cabine1 = new Cabine(12);
        Cabine cabine2 = new Cabine(30);
        Cabine cabine3 = new Cabine(25);

        veleiro1.designarCapitao(capitao1);
        iate1.designarCapitao(capitao2);

        veleiro1.addMastro(mastro1);
        veleiro1.addMastro(mastro2);

        iate1.addCabine(cabine2);
        iate2.addCabine(cabine1);
        iate2.addCabine(cabine3);

        System.out.println(veleiro1.avaliar());
        System.out.println(iate1.compareTo(iate2));
    }
}
