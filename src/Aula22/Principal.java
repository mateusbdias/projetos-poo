package Aula22;

public class Principal {
    public static void main(String[] args) {
        Trem trem = new Trem();

        Figura figura1 = new Retangulo("Retângulo 5x4", 5, 4);
        Figura figura2 = new Retangulo("Retângulo 6x4", 6, 4);
        Figura figura3 = new Circulo("Círculo raio 1", 1);
        Figura figura4 = new Triangulo("Triângulo 2x2", 2, 2);
        Figura vagao = new Composto("Vagão");
        Figura locomotiva = new Composto("Locomotiva");

        ((Composto)vagao).inserirFigura(figura1);
        ((Composto)vagao).inserirFigura(figura3);
        ((Composto)vagao).inserirFigura(figura3);
        ((Composto)vagao).inserirFigura(figura3);
        ((Composto)vagao).mostrarFiguras();
        System.out.println(((Composto)vagao).calcularArea());

        ((Composto)locomotiva).inserirFigura(figura2);
        ((Composto)locomotiva).inserirFigura(figura3);
        ((Composto)locomotiva).inserirFigura(figura3);
        ((Composto)locomotiva).inserirFigura(figura4);
        ((Composto)locomotiva).mostrarFiguras();
        System.out.println(((Composto)locomotiva).calcularArea());

        trem.adicionarFigura(vagao);
        trem.adicionarFigura(locomotiva);
        trem.mostrarFiguras();
        System.out.println(trem.areaTotal());
    }
}
