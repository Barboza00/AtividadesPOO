import java.util.ArrayList;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    //A vantagem de usar o construtor é que ele já deixa tudo pré-definido sem precisar gastar muito tempo.
    public Carro(String marca, String modelo, int anoFabricacao) {
        if (marca == null || modelo == null || anoFabricacao < 1886 || anoFabricacao > 2026) {
            System.out.println("Erro: Marca(e/ou) Ano invalido");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao =  anoFabricacao;
    }

    public void exibir(){
        System.out.println("Carro: " + marca + " " + modelo + " - Ano: " + anoFabricacao);
    }

    public int idadeDoCarro(){
        return 2026 - anoFabricacao;
    }

public static void main(String[] args) {

    ArrayList<Carro> minhaGaragem = new ArrayList<>();

    minhaGaragem.add(new Carro("Honda", "Civic", 1886));
    minhaGaragem.add(new Carro("Ford", "Maverick", 2000));
    minhaGaragem.add(new Carro("Toyota", "Corolla", 2010));

        System.out.println("----- EXIBINDO TODOS OS CARROS DA LISTA -----");

        for(Carro carroDaVez : minhaGaragem){
            carroDaVez.exibir();
        }
    }
}