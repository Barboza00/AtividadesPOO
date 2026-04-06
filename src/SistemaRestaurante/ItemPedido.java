package SistemaRestaurante;

public class ItemPedido {
    public static int totalItensCriados = 0;

    private int id;
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        totalItensCriados++;
        this.id = totalItensCriados;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }
}