package DeliveryDaCamila;

public class Pedido {

    public static int totalPedidos = 0;
    public static double valorTotalVendido = 0.0;

    private String nomeCliente;
    private Marmita marmitaEscolhida;

    public Pedido(String nomeCliente, Marmita marmitaEscolhida) {
        this.nomeCliente = nomeCliente;
        this.marmitaEscolhida = marmitaEscolhida;
        totalPedidos++;
        valorTotalVendido += marmitaEscolhida.getPreco();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Marmita getMarmitaEscolhida() {
        return marmitaEscolhida;
    }

    public static double calcularTotalVendido() {
        return valorTotalVendido;
    }
}