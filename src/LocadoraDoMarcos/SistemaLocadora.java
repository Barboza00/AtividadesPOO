package LocadoraDoMarcos;

import java.util.Scanner;

public class SistemaLocadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Locadora minhaLocadora = new Locadora();
        int opcao = 0;

        System.out.println("📼 BEM-VINDO À LOCADORA DO MARCOS 📼");

        while (opcao != 4) {
            System.out.println("\n1) Cadastrar Filme | 2) Listar Acervo | 3) Ver Total de Filmes | 4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.print("Título do filme: ");
                String titulo = leitor.nextLine();

                System.out.print("Gênero: ");
                String genero = leitor.nextLine();

                System.out.print("Ano de lançamento: ");
                int ano = leitor.nextInt();
                leitor.nextLine();

                minhaLocadora.cadastrarFilme(titulo, genero, ano);

            } else if (opcao == 2) {
                minhaLocadora.listarFilmes();

            } else if (opcao == 3) {
                System.out.println("\n📊 STATUS DA LOCADORA 📊");
                System.out.println("Total de filmes no acervo: " + Filme.totalFilmes);

            } else if (opcao == 4) {
                System.out.println("\nFechando a locadora. Bom filme e não esqueça de rebobinar a fita!");
            } else {
                System.out.println("\n❌ Opção inválida! Tente novamente.");
            }
        }

        leitor.close();
    }
}