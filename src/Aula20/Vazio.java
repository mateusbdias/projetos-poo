package Aula20;

public class Vazio implements Estado{
    private Carrinho carrinho;

    public Vazio(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto() {
        carrinho.setEstado(new Carregando(carrinho));
        System.out.println("Carrinho pode receber produtos agora");
    }

    @Override
    public void cancelar() {
        System.out.println("Carrinho já está vazio!");
    }

    @Override
    public void retornar() {
        System.out.println("Carrinho já está vazio!");
    }

    @Override
    public void proximo() {
        carrinho.setEstado(new Carregando(carrinho));
        System.out.println("Carrinho pode receber produtos agora");
    }
}
