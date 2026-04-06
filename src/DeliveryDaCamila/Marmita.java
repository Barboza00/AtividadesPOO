package DeliveryDaCamila;

public class Marmita {

    public static final double PRECO_P = 18.00;
    public static final double PRECO_M = 25.00;
    public static final double PRECO_G = 32.00;

    private String descricao;
    private String tamanho;

    public Marmita(String descricao, String tamanho) {
        this.descricao = descricao;
        this.tamanho = tamanho.toUpperCase();
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        if (tamanho.equals("P")) {
            return PRECO_P;
        } else if (tamanho.equals("M")) {
            return PRECO_M;
        } else if (tamanho.equals("G")) {
            return PRECO_G;
        }
        return 0.0;
    }
}