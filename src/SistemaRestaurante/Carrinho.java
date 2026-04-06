package SistemaRestaurante;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItemPedido> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void incluirItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
        System.out.println("✅ Item adicionado ao carrinho!");
    }

    public void consultarCarrinho() {
        if (itens.isEmpty()) {
            System.out.println("🛒 Seu carrinho está vazio.");
            return;
        }

        double total = 0;
        System.out.println("\n🛒 --- MEU CARRINHO ---");
        for (ItemPedido item : itens) {
            System.out.println("ID: " + item.getId() + " | " + item.getProduto().getNome() + " | Qtd: " + item.getQuantidade() + " | Subtotal: R$" + item.getSubtotal());
            total += item.getSubtotal();
        }
        System.out.println("-----------------------");
        System.out.println("Total da Compra: R$" + total);
    }

    public void editarItem(int id, int novaQuantidade) {
        for (ItemPedido item : itens) {
            if (item.getId() == id) {
                item.setQuantidade(novaQuantidade);
                System.out.println("✅ Quantidade atualizada com sucesso!");
                return;
            }
        }
        System.out.println("❌ ID não encontrado no carrinho.");
    }

    public void excluirItem(int id) {
        boolean removido = itens.removeIf(item -> item.getId() == id);
        if (removido) {
            System.out.println("🗑️ Item removido do carrinho.");
        } else {
            System.out.println("❌ ID não encontrado no carrinho.");
        }
    }
}