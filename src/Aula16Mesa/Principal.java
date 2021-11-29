package Aula16Mesa;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        try{
            Paciente paciente1 = new Paciente("Christh", "Teixeira", "98765", LocalDate.of(2021, 11, 25));
            paciente1.darAlta(LocalDate.of(2021, 11, 20));
        } catch(PacienteException e) {
            System.err.println(e);
        }

        try{
            Paciente paciente2 = new Paciente("Yana", "Marques", "12345", LocalDate.of(2021, 11, 29));
            paciente2.darAlta(LocalDate.of(2021, 11, 20));
        } catch(PacienteException e) {
            System.err.println(e);
        }
    }
}
