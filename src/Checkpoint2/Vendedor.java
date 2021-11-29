package Checkpoint2;

import java.util.ArrayList;

public class Vendedor extends Usuario {
    private int cnpj;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Vendedor(String username, String senha, String nome, String sobrenome, int cnpj) {
        super(username, senha, nome, sobrenome);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void cadastrarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        this.produtos.remove(produto);
    }
}
