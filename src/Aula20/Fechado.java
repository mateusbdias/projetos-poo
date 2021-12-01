package Aula20;

public class Fechado implements Estado{
    private Carrinho carrinho;

    public Fechado(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto() {
        System.out.println("Carrinho não aceita mais produtos!");
    }

    @Override
    public void cancelar() {
        System.out.println("Carrinho já foi fechado!");
    }

    @Override
    public void retornar() {
        System.out.println("Carrinho já foi fechado!");
    }

    @Override
    public void proximo() {
        carrinho.setEstado(new Vazio(carrinho));
        carrinho.limparCarrinho();
        System.out.println("Carrinho foi esvaziado após finalização da compra");
    }
}
