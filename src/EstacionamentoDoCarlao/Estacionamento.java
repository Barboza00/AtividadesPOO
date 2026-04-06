package EstacionamentoDoCarlao;

import java.util.ArrayList;

public class Estacionamento {

    // static final conforme pedido no exercício
    public static final int MAX_VAGAS = 20;

    private ArrayList<Veiculo> carrosEstacionados;

    public Estacionamento() {
        this.carrosEstacionados = new ArrayList<>();
    }

    public void entrarVeiculo(Veiculo v) {
        if (carrosEstacionados.size() < MAX_VAGAS) {
            carrosEstacionados.add(v);
            System.out.println("✅ Veículo placa " + v.getPlaca() + " entrou. Vaga garantida!");
        } else {
            System.out.println("❌ Lotação máxima! Estacionamento cheio (20/20).");
        }
    }

    public void sairVeiculo(String placaProcurada) {
        boolean encontrado = false;

        for (int i = 0; i < carrosEstacionados.size(); i++) {
            if (carrosEstacionados.get(i).getPlaca().equalsIgnoreCase(placaProcurada)) {
                System.out.println("🚗 Veículo placa " + carrosEstacionados.get(i).getPlaca() + " liberou a vaga.");
                carrosEstacionados.remove(i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("⚠️ Erro: Veículo com placa " + placaProcurada + " não encontrado no pátio.");
        }
    }

    public void exibirStatus() {
        int ocupadas = carrosEstacionados.size();
        int livres = MAX_VAGAS - ocupadas;

        System.out.println("\n📊 --- STATUS DO PÁTIO ---");
        System.out.println("Capacidade Total: " + MAX_VAGAS);
        System.out.println("Vagas Ocupadas: " + ocupadas);
        System.out.println("Vagas Livres: " + livres);
        System.out.println("--------------------------");
    }

    // MÉTODO NOVO: Necessário para a Main saber quantos carros tem sem causar erro
    public int getVagasOcupadas() {
        return carrosEstacionados.size();
    }
}