package Checkpoint2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Instanciando um cartão
        Cartao cartao = new Cartao(12345678, 123, LocalDate.of(2025, 11, 01));

        // Instanciando os endereços
        Endereco endereco1 = new Endereco("Avenida Paulista", 1000, "Cj 101", "Bela Vista", "São Paulo", "SP");
        Endereco endereco2 = new Endereco("Rua Mateus Grou", 230, "Apt 23", "Pinheiros", "São Paulo", "SP");

        // Instanciando o comprador
        Comprador mateusbdias = new Comprador("mateusbdias", "qwerty123", "Mateus", "Benites Dias", 987654,
                LocalDate.of(1994, 05, 23));
        mateusbdias.vincularEndereco(endereco2); // Endereço vinculado
        mateusbdias.vincularCartao(cartao); // Cartão vinculado
        mateusbdias.redefinirSenha("password"); // Alteração de senha

        // Instanciando o vendedor
        Vendedor nintenshop = new Vendedor("nintenshop", "m4r108r02", "Luigi", "Mario", 123456);
        nintenshop.vincularEndereco(endereco1); // Endereço vinculado

        System.out.println("Dados do Comprador:");
        System.out.println(mateusbdias.toString());
        System.out.println("Senha: "+ mateusbdias.getSenha());
        System.out.println("==========================");
        System.out.println("Dados do Vendedor:");
        System.out.println(nintenshop.toString());
        System.out.println("==========================");

        // Cadastro de produtos
        Produto mkwii = new Produto("Mario Kart Wii", "Nintendo Wii", "Nintendo", LocalDate.of(2008, 4, 27),
                150.5f, 10);
        Produto ssbbrawl = new Produto("Super Smash Bros. Brawl", "Nintendo Wii", "Nintendo", LocalDate.of(2008, 3, 9),
                190.5f, 5);
        Produto luigismansion3 = new Produto("Luigi's Mansion 3", "Nintendo", "Nintendo Switch", LocalDate.of(2019, 10, 31),
                290.0f, 4);
        // Vínculo dos produtos ao estoque do vendedor
        nintenshop.cadastrarProduto(mkwii);
        nintenshop.cadastrarProduto(ssbbrawl);
        nintenshop.cadastrarProduto(luigismansion3);

        System.out.println("Produtos em estoque:");
        nintenshop.verProdutos();

        // Produtos adicionados ao carrinho do comprador
        mateusbdias.adicionarProduto(mkwii, 2);
        mateusbdias.adicionarProduto(ssbbrawl, 1);

        System.out.println("Produtos no carrinho:");
        mateusbdias.verCarrinho();
        System.out.println("==========================");

        // Finalizando a compra
        System.out.println("Compra finalizada!");
        System.out.println("Total da compra: " + mateusbdias.finalizarCompra());
        System.out.println("==========================");

        System.out.println("Carrinho vazio:");
        mateusbdias.verCarrinho();
        System.out.println("==========================");
        System.out.println("Nova quantidade de produtos em estoque:");
        nintenshop.verProdutos();
    }
}
