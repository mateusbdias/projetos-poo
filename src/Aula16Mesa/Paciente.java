package Aula16Mesa;

import java.time.LocalDate;

public class Paciente {
    private String nome;
    private String sobrenome;
    private String rg;
    private LocalDate dataInternacao;
    private LocalDate dataAlta;

    public Paciente(String nome, String sobrenome, String rg, LocalDate dataInternacao) throws PacienteException{
        LocalDate hoje = LocalDate.now();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataAlta = null;
        if (dataInternacao.isBefore(hoje)){
            throw new PacienteException("Preenchida data de internação no passado!");
        } else if (dataInternacao.isAfter(hoje)){
            throw new PacienteException("Preenchida data de internação no futuro!");
        } else {
            this.dataInternacao = dataInternacao;
        }
    }

    public LocalDate getDataInternacao(){
        return dataInternacao;
    }

    public LocalDate getDataAlta(){
        return dataAlta;
    }

    public void darAlta(LocalDate dataAlta) throws PacienteException{
        if (dataAlta.isBefore(dataInternacao)){
            throw new PacienteException("Preenchida data de alta anterior à de internação!");
        } else {
            this.dataAlta = dataAlta;
            System.out.println("Paciente liberado em " + dataAlta);
        }
    }
}
