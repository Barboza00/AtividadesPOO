package EstacionamentoDoCarlao;

import java.util.Scanner;

public class SistemaCarlao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Estacionamento patio = new Estacionamento();
        int opcao = 0;

        System.out.println("🚗 BEM-VINDO AO ESTACIONAMENTO DO CARLÃO 🚗");

        while (opcao != 4) {
            System.out.println("\n1) Entrada de Veículo | 2) Saída de Veículo | 3) Status de Vagas | 4) Fechar Sistema");
            System.out.print("Escolha a operação: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpa o buffer

            if (opcao == 1) {
                // CORREÇÃO: Agora chama os métodos que realmente existem
                if (patio.getVagasOcupadas() >= Estacionamento.MAX_VAGAS) {
                    System.out.println("❌ O estacionamento já está com a lotação máxima!");
                } else {
                    System.out.print("Placa do carro: ");
                    String placa = leitor.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = leitor.nextLine();

                    Veiculo novoCarro = new Veiculo(placa, modelo);
                    patio.entrarVeiculo(novoCarro);
                }

            } else if (opcao == 2) {
                System.out.print("Digite a placa do carro que está saindo: ");
                String placaSaida = leitor.nextLine();
                patio.sairVeiculo(placaSaida);

            } else if (opcao == 3) {
                patio.exibirStatus();

            } else if (opcao == 4) {
                System.out.println("\nEncerrando o expediente. Até amanhã, Carlão!");
            } else {
                System.out.println("\n❌ Opção inválida!");
            }
        }

        leitor.close();
    }
}