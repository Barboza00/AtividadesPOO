package AcademiaDaFernanda;

import java.util.Scanner;

public class SistemaAcademia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Academia minhaAcademia = new Academia();
        int opcao = 0;

        System.out.println("🏋️ BEM-VINDO AO SISTEMA DA ACADEMIA DA FERNANDA 🏋️");

        while (opcao != 4) {
            System.out.println("\n1) Matricular Aluno | 2) Listar Alunos | 3) Ver Total de Alunos | 4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer

            if (opcao == 1) {
                // Validação inteligente: barra antes mesmo de pedir os dados se estiver lotado
                if (Academia.totalMatriculados >= Academia.MAX_ALUNOS) {
                    System.out.println("❌ Não é possível cadastrar. A academia está lotada!");
                } else {
                    System.out.print("Nome do aluno: ");
                    String nome = leitor.nextLine();

                    System.out.print("Idade: ");
                    int idade = leitor.nextInt();
                    leitor.nextLine();

                    System.out.print("Plano (Mensal ou Anual): ");
                    String plano = leitor.nextLine();

                    // Manda para a classe Academia, que fará a validação da idade
                    minhaAcademia.matricularAluno(nome, idade, plano);
                }

            } else if (opcao == 2) {
                minhaAcademia.listarAlunos();

            } else if (opcao == 3) {
                System.out.println("\n📊 STATUS DE MATRÍCULAS 📊");
                System.out.println("Total de alunos: " + Academia.totalMatriculados + " / " + Academia.MAX_ALUNOS);

            } else if (opcao == 4) {
                System.out.println("\nFechando o sistema. Bom treino a todos!");
            } else {
                System.out.println("\n❌ Opção inválida! Tente novamente.");
            }
        }

        leitor.close();
    }
}