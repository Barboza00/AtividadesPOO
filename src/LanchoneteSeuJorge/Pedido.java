package LanchoneteSeuJorge;

import java.util.ArrayList;

public class Pedido {
    public static int totalPedidos = 0;

    private ArrayList<Lanche> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
        totalPedidos++;
    }

    public void adicionarLanche(Lanche lanche) {
        itens.add(lanche);
    }

    public double calcularTotal() {
        double soma = 0;
        for (Lanche l : itens) {
            soma += l.getPreco();
        }
        return soma;
    }

    public void imprimirCupom() {
        System.out.println("\n=== CUPOM FISCAL ===");
        for (Lanche l : itens) {
            System.out.println("- " + l.getNome() + " (R$ " + l.getPreco() + ")");
        }
        System.out.println("--------------------");
        System.out.println("TOTAL: R$ " + calcularTotal());
        System.out.println("====================\n");
    }
}