public class Produtos {

    private int id;
    private String nome;
    private Double preco;
    private int qtdEmEstoque;

    public Produtos(int id, String nome, Double preco, int qtdEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public void addStoque(int qtd){
        if(qtd > 0){
            qtdEmEstoque += qtd;
            System.out.println(qtd + " " + nome + "(s) adicionado(s) ao estoque.");
        }
    }

    public void vender(int qtd){
        if(qtd > 0 && qtd <= qtdEmEstoque){
            qtdEmEstoque -= qtd;
            System.out.println(qtd + " " + nome + "(s) vendido(s).");
        } else {
            System.out.println("Quantidade insuficiente em estoque para venda.");
        }
    }

    public double getValorTotal() {
        return preco * qtdEmEstoque;
    }

    public int getQtdEmEstoque() {
        return qtdEmEstoque;
    }

}
