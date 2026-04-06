package DeliveryDaCamila;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDelivery {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Marmita> cardapio = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n🍲 --- DELIVERY DA CAMILA --- 🍲");
            System.out.println("1) Cadastrar Marmita no Cardápio");
            System.out.println("2) Registrar Pedido");
            System.out.println("3) Listar Pedidos do Dia");
            System.out.println("4) Ver Resumo de Vendas");
            System.out.println("5) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.print("Descrição da marmita: ");
                String desc = leitor.nextLine();

                System.out.print("Tamanho (P, M ou G): ");
                String tam = leitor.nextLine();

                if (tam.equalsIgnoreCase("P") || tam.equalsIgnoreCase("M") || tam.equalsIgnoreCase("G")) {
                    cardapio.add(new Marmita(desc, tam));
                    System.out.println("✅ Marmita cadastrada com sucesso!");
                } else {
                    System.out.println("❌ Tamanho inválido. Use P, M ou G.");
                }

            } else if (opcao == 2) {
                if (cardapio.isEmpty()) {
                    System.out.println("⚠️ O cardápio está vazio. Cadastre as marmitas primeiro!");
                } else {
                    System.out.print("Nome do cliente: ");
                    String nome = leitor.nextLine();

                    System.out.println("\nOpções do Cardápio:");
                    for (int i = 0; i < cardapio.size(); i++) {
                        Marmita m = cardapio.get(i);
                        System.out.println(i + " - " + m.getDescricao() + " (" + m.getTamanho() + ") - R$" + m.getPreco());
                    }

                    System.out.print("Escolha o número da marmita: ");
                    int escolha = leitor.nextInt();
                    leitor.nextLine();

                    if (escolha >= 0 && escolha < cardapio.size()) {
                        Marmita marmitaEscolhida = cardapio.get(escolha);
                        pedidos.add(new Pedido(nome, marmitaEscolhida));
                        System.out.println("✅ Pedido registrado com sucesso!");
                    } else {
                        System.out.println("❌ Opção de cardápio inválida.");
                    }
                }

            } else if (opcao == 3) {
                if (pedidos.isEmpty()) {
                    System.out.println("⚠️ Nenhum pedido registrado hoje.");
                } else {
                    System.out.println("\n📋 --- PEDIDOS DO DIA ---");
                    for (Pedido p : pedidos) {
                        Marmita m = p.getMarmitaEscolhida();
                        System.out.println("- Cliente: " + p.getNomeCliente() + " | Pedido: " + m.getDescricao() + " (" + m.getTamanho() + ") | R$" + m.getPreco());
                    }
                }

            } else if (opcao == 4) {
                System.out.println("\n💰 --- RESUMO DE VENDAS ---");
                System.out.println("Total de pedidos realizados: " + Pedido.totalPedidos);
                System.out.println("Valor total arrecadado: R$" + Pedido.calcularTotalVendido());

            } else if (opcao == 5) {
                System.out.println("\nFechando o delivery. Bom descanso!");
            } else {
                System.out.println("\n❌ Opção inválida!");
            }
        }

        leitor.close();
    }
}