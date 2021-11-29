package Checkpoint2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comprador extends Usuario {
    private int cpf;
    private LocalDate dataNascimento;
    private Cartao cartao;
    private ArrayList<Produto> carrinho = new ArrayList<>();
    private float subtotal;

    public Comprador(String username, String senha, String nome, String sobrenome, int cpf, LocalDate dataNascimento, Cartao cartao) {
        super(username, senha, nome, sobrenome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.cartao = cartao;
        this.subtotal = 0;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCartao() {
        return cartao.toString();
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Username: " + getUsername() + "\nNome: " + getNome() +
                "\nSobrenome: " + getSobrenome() + "\nEndereço: " +
                getEndereco() + "\nCPF: " + getCpf() +
                "\nData de Nascimento: " + getDataNascimento() +
                "\nCartão: " + this.cartao.toString();
    }

    public void vincularCartao(Cartao cartao){
        this.cartao = cartao;
    }

    public void adicionarProduto(Produto produto, int qtd){
        for (int i = 1; i <= qtd; i++){
            this.carrinho.add(produto);
        }
        this.subtotal += (produto.getPreco()) * qtd;
    }

    public void removerProduto(Produto produto, int qtd){
        for (int i = 1; i <= qtd; i++){
            this.carrinho.remove(produto);
        }
        this.subtotal -= (produto.getPreco()) + qtd;
    }

    public float finalizarCompra(){
        float total = this.subtotal;
        this.subtotal = 0;
        return total;
    }
}
