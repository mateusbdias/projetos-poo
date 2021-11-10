package Aula10;

public class Principal {
    public static void main(String[] args){
        Associado associado = new Associado("123", "Yana", 90, "Musculação");
        System.out.println(associado.custoMensal());

        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("456", "Christh", 120, "Natação", 50);
        associadoHabilitado.setHabilitado(true);
        System.out.println(associadoHabilitado.custoMensal());

        System.out.println(associado);
    }
}
