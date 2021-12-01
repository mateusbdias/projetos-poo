package Aula20;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Chinelo azul", 25.5);
        Produto produto2 = new Produto("Bola de basquete", 80.95);

        Carrinho carrinho = new Carrinho();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.listarProdutos();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.proximo();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.cancelar();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.proximo();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.proximo();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.cancelar();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.proximo();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
    }
}
