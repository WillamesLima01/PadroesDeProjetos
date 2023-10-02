public class Main {

    public static void main(String[] args) {

        Produtos produtos = new Produtos(1, "café", 10.0, 4);

        System.out.println("Quantidade em estoque: " + produtos.getQtdEmEstoque());
        System.out.println("Valor total do estoque: " + produtos.getValorTotal());

        produtos.addStoque(5);
        produtos.vender(2);

        System.out.println("Quantidade em estoque: " + produtos.getQtdEmEstoque());
        System.out.println("Valor total do estoque: " + produtos.getValorTotal());

    }
}
