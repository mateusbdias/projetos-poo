package Aula20;

public class Carregando implements Estado{
    private Carrinho carrinho;

    public Carregando(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto() {
        System.out.println("Carrinho já pode receber produtos");
    }

    @Override
    public void cancelar() {
        carrinho.setEstado(new Vazio(carrinho));
        carrinho.limparCarrinho();
        System.out.println("Carrinho foi esvaziado");
    }

    @Override
    public void retornar() {
        carrinho.setEstado(new Vazio(carrinho));
        carrinho.limparCarrinho();
        System.out.println("Carrinho foi esvaziado");
    }

    @Override
    public void proximo() {
        carrinho.setEstado(new Pagando(carrinho));
        System.out.println("Carrinho aguardando finalização da compra");
    }
}
