package Checkpoint2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comprador extends Usuario {
    private int cpf;
    private LocalDate dataNascimento;
    private Cartao cartao;
    private ArrayList<Produto> carrinho = new ArrayList<>(); // Atributo adicionado para controle dos produtos no carrinho de compras
    private float subtotal; // Atributo adicionado para controle do subtotal da compra

    // Construtor sem o cartão (há método específico para vinculação ao comprador)
    public Comprador(String username, String senha, String nome, String sobrenome, int cpf, LocalDate dataNascimento) {
        super(username, senha, nome, sobrenome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
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
                getEndereco() + "\nCPF: " + cpf +
                "\nData de Nascimento: " + dataNascimento +
                "\nCartão:\n" + this.cartao.toString();
    }

    // Método utilizado para vincular o cartão ao usuário (substitui o respectivo Setter)
    public void vincularCartao(Cartao cartao){
        this.cartao = cartao;
    }

    // Métodos adicionados para gerenciamento do carrinho de compras
    public void adicionarProduto(Produto produto, int qtd){
        for (int i = 1; i <= qtd; i++){
            this.carrinho.add(produto); // Adiciona o produto ao carrinho, o número de vezes informado...
        }
        this.subtotal += (produto.getPreco()) * qtd; // ...e soma o respectivo valor ao subtotal da compra
    }

    public void removerProduto(Produto produto, int qtd){
        for (int i = 1; i <= qtd; i++){
            this.carrinho.remove(produto); // Remove o produto do carrinho, o número de vezes informado...
        }
        this.subtotal -= (produto.getPreco()) + qtd; // ...e subtrai o respectivo valor do subtotal da compra
    }

    public void verCarrinho(){
        for (Produto produto: carrinho) {
            System.out.println(produto.toString("C")); // Mostra cada um dos produtos no carrinho de compras
            System.out.println("==========================");
        }
        System.out.println("Subtotal: " + getSubtotal()); // Mostra o subtotal da compra
    }

    public float finalizarCompra(){
        float total = this.subtotal; // Atribui o valor do atributo subtotal a uma nova variável
        this.subtotal = 0; // Como o valor já está armazenado em outra variável, podemos zerar o subtotal, preparando o objeto para uma nova compra no futuro
        for (Produto produto: this.carrinho) {
            produto.setQtd(produto.getQtd() - 1); // Reduzimos a quantidade do produto no estoque
        }
        this.carrinho.clear(); // Removemos todos os produtos do carrinho
        return total;
    }
}
