package Aula20;

public class Pagando implements Estado{
    private Carrinho carrinho;

    public Pagando(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public void adicionarProduto() {
        System.out.println("Carrinho não aceita mais produtos!");
    }

    @Override
    public void cancelar() {
        carrinho.setEstado(new Vazio(carrinho));
        carrinho.limparCarrinho();
        System.out.println("Carrinho foi esvaziado");
    }

    @Override
    public void retornar() {
        carrinho.setEstado(new Carregando(carrinho));
        System.out.println("Carrinho foi reaberto para adição de produtos");
    }

    @Override
    public void proximo() {
        carrinho.setEstado(new Fechado(carrinho));
        System.out.println("Carrinho fechado e compra finalizada");
    }
}
