import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<Carro> garagem = new ArrayList<>();
        int opcao = 0;

        System.out.println("=== BEM-VINDO AO SISTEMA DE GARAGEM ===");

        while (opcao != 4) {
            System.out.println("\nMenu:");
            System.out.println("1) Cadastrar Carro");
            System.out.println("2) Listar todos");
            System.out.println("3) Total cadastrado");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.println("\n-- Cadastrando novo carro --");
                System.out.print("Digite a marca: ");
                String marca = leitor.nextLine();

                System.out.print("Digite o modelo: ");
                String modelo = leitor.nextLine();

                System.out.print("Digite o ano de fabricação: ");
                int ano = leitor.nextInt();

                Carro novoCarro = new Carro(marca, modelo, ano);

                garagem.add(novoCarro);
                System.out.println("Tentativa de cadastro processada!");

            } else if (opcao == 2) {
                System.out.println("\n-- Lista de Carros na Garagem --");
                if (garagem.isEmpty()) {
                    System.out.println("Nenhum carro cadastrado ainda.");
                } else {
                    for (Carro c : garagem) {
                        c.exibir();
                    }
                }

            } else if (opcao == 3) {
                System.out.println("\n-- Estatísticas --");
                System.out.println("Total de carros validados e criados: " + Carro.totalCarros);

            } else if (opcao == 4) {
                System.out.println("\nEncerrando o sistema... Até mais!");
            } else {
                System.out.println("\nOpção inválida! Escolha um número de 1 a 4.");
            }
        }

        leitor.close();
    }
}