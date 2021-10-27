package Aula06;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args){
        Impressora impressora = new Impressora("Epson", "Wi-Fi",
                LocalDate.of(2021, 5, 12));
        System.out.println(impressora.getDataFabricacao());
        impressora.setFolhasDisponiveis(100);
        impressora.imprimir("Hello World!");
        System.out.println(impressora.getFolhasDisponiveis());
    }
}
