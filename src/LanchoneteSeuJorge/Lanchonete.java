package LanchoneteSeuJorge;

import java.util.ArrayList;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Lanche> cardapio = new ArrayList<>();
        int opcao = 0;

        System.out.println("🍔 SISTEMA DA LANCHONETE DO SEU JORGE 🍔");

        while (opcao != 4) {
            System.out.println("\n1) Cadastrar Lanche | 2) Fazer Pedido | 3) Relatório do Dia | 4) Fechar o Caixa");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do Lanche: ");
                String nome = leitor.nextLine();

                System.out.print("Preço (R$): ");
                double preco = leitor.nextDouble();
                leitor.nextLine();

                Lanche novoLanche = new Lanche(nome, preco);
                cardapio.add(novoLanche);
                System.out.println("✅ Lanche cadastrado com sucesso!");

            } else if (opcao == 2) {
                if (cardapio.isEmpty()) {
                    System.out.println("⚠️ O cardápio está vazio! Cadastre lanches primeiro.");
                } else {
                    Pedido pedidoAtual = new Pedido();
                    int escolha = -1;

                    System.out.println("\n-- Novo Pedido Aberto --");
                    while (escolha != 0) {
                        System.out.println("\nCARDÁPIO:");
                        for (int i = 0; i < cardapio.size(); i++) {
                            System.out.println((i + 1) + ". " + cardapio.get(i).getNome() + " - R$ " + cardapio.get(i).getPreco());
                        }
                        System.out.println("0. Finalizar Pedido");
                        System.out.print("Digite o número do lanche: ");

                        escolha = leitor.nextInt();
                        leitor.nextLine();

                        if (escolha > 0 && escolha <= cardapio.size()) {
                            pedidoAtual.adicionarLanche(cardapio.get(escolha - 1));
                            System.out.println("✅ Adicionado à bandeja!");
                        } else if (escolha != 0) {
                            System.out.println("❌ Opção inválida!");
                        }
                    }

                    pedidoAtual.imprimirCupom();
                }

            } else if (opcao == 3) {
                System.out.println("\n📊 RELATÓRIO DE VENDAS 📊");
                System.out.println("Total de pedidos realizados hoje: " + Pedido.totalPedidos);

            } else if (opcao == 4) {
                System.out.println("\nFechando a lanchonete. Bom descanso, Seu Jorge!");
            } else {
                System.out.println("\n❌ Opção inválida! Tente novamente.");
            }
        }

        leitor.close();
    }
}