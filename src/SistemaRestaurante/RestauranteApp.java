package SistemaRestaurante;

import java.util.Scanner;

public class RestauranteApp {

    public static final String USUARIO_CORRETO = "admin";
    public static final String SENHA_CORRETA = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean logado = false;

        System.out.println("🍕 BEM-VINDO AO SISTEMA DE RESTAURANTE 🍕");

        while (!logado) {
            System.out.println("\n1) Fazer Login | 2) Encerrar Programa");
            System.out.print("Opção: ");
            int opLogin = scanner.nextInt();
            scanner.nextLine();

            if (opLogin == 2) {
                System.out.println("Programa encerrado.");
                System.exit(0);
            } else if (opLogin == 1) {
                System.out.print("Usuário: ");
                String user = scanner.nextLine();

                System.out.print("Senha: ");
                String pass = scanner.nextLine();

                if (user.equals(USUARIO_CORRETO) && pass.equals(SENHA_CORRETA)) {
                    logado = true;
                    System.out.println("🔓 Login realizado com sucesso!");
                } else {
                    System.out.println("❌ Credenciais inválidas. Tente novamente.");
                }
            } else {
                System.out.println("Opção inválida.");
            }
        }

        Produto p1 = new Produto("Cachorro-Quente", 15.00);
        Produto p2 = new Produto("Sushi", 35.00);
        Produto p3 = new Produto("Pizza", 40.00);
        Produto p4 = new Produto("Baguncinha", 20.00);

        Carrinho carrinho = new Carrinho();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n🍔 --- MENU PRINCIPAL --- 🍔");
            System.out.println("1) ➕ Incluir Pedido");
            System.out.println("2) 🔍 Consultar Carrinho");
            System.out.println("3) ✏️ Editar Pedido");
            System.out.println("4) 🗑️ Excluir Pedido");
            System.out.println("5) 🚪 Sair e Finalizar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("\n📖 --- CARDÁPIO ---");
                System.out.println("1) " + p1.getNome() + " - R$" + p1.getPreco());
                System.out.println("2) " + p2.getNome() + " - R$" + p2.getPreco());
                System.out.println("3) " + p3.getNome() + " - R$" + p3.getPreco());
                System.out.println("4) " + p4.getNome() + " - R$" + p4.getPreco());
                System.out.print("Digite o número do produto: ");
                int opProd = scanner.nextInt();

                System.out.print("Digite a quantidade: ");
                int qtd = scanner.nextInt();
                scanner.nextLine();

                if (opProd == 1) carrinho.incluirItem(p1, qtd);
                else if (opProd == 2) carrinho.incluirItem(p2, qtd);
                else if (opProd == 3) carrinho.incluirItem(p3, qtd);
                else if (opProd == 4) carrinho.incluirItem(p4, qtd);
                else System.out.println("❌ Produto inválido.");

            } else if (opcao == 2) {
                carrinho.consultarCarrinho();

            } else if (opcao == 3) {
                carrinho.consultarCarrinho();
                System.out.print("\nDigite o ID do item que deseja editar: ");
                int id = scanner.nextInt();

                System.out.print("Digite a nova quantidade: ");
                int novaQtd = scanner.nextInt();
                scanner.nextLine();

                carrinho.editarItem(id, novaQtd);

            } else if (opcao == 4) {
                carrinho.consultarCarrinho();
                System.out.print("\nDigite o ID do item que deseja excluir: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                carrinho.excluirItem(id);

            } else if (opcao == 5) {
                System.out.println("\nFinalizando o sistema... Volte sempre!");
            } else {
                System.out.println("❌ Opção inválida!");
            }
        }

        scanner.close();
    }
}