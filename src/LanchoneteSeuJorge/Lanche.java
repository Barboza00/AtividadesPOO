package LanchoneteSeuJorge;

public class Lanche {
    private String nome;
    private double preco;

    public Lanche(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("⚠️ Preço inválido! Ajustando para R$ 0.0");
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }
}