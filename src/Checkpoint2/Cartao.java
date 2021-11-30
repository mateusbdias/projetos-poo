package Checkpoint2;

import java.time.LocalDate;

public class Cartao {
    private int numero;
    private int codSeguranca;
    private LocalDate dataValidade;

    public Cartao(int numero, int codSeguranca, LocalDate dataValidade) {
        this.numero = numero;
        this.codSeguranca = codSeguranca;
        this.dataValidade = dataValidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Facilita a visualização dos dados do cartão com o método getCartao() da classe Comprador
    @Override
    public String toString() {
        return "Número: " + numero + "\nCódigo de Seguranca: " + codSeguranca +
                "\nData de Validade: " + dataValidade;
    }
}
