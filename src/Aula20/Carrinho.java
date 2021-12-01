package Aula20;

import java.util.ArrayList;

public class Carrinho {
    private Estado estado;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Carrinho() {
        setEstado(new Vazio(this));
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void adicionarProduto(Produto produto){
        getEstado().adicionarProduto();
        produtos.add(produto);
        System.out.println("Produto adicionado ao carrinho: " + produto.getDescricao());
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
        System.out.println("Produto removido do carrinho");
    }

    public void limparCarrinho(){
        produtos.clear();
    }

    public void listarProdutos(){
        System.out.println("Produtos no carrinho:");
        for(Produto produto: produtos){
            System.out.println(produto.toString());
            System.out.println("====================");
        }
    }

    public void cancelar(){
        getEstado().cancelar();
    }

    public void retornar(){
        getEstado().retornar();
    }

    public void proximo(){
        getEstado().proximo();
    }
}
