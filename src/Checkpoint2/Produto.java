package Checkpoint2;

import java.time.LocalDate;

public class Produto {
    private String nome;
    private String plataforma;
    private String publisher;
    private LocalDate dataLancamento;
    private float preco;
    private int qtd;

    public Produto(String nome, String plataforma, String publisher, LocalDate dataLancamento, float preco, int qtd) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.publisher = publisher;
        this.dataLancamento = dataLancamento;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float aplicarDesconto(float desconto){
        return preco = preco * (1 - desconto);
    }
}
