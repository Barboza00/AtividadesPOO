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
            return;
        }
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao =  anoFabricacao;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.anoFabricacao = 0;
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
    minhaGaragem.add(new Carro());

        System.out.println("----- EXIBINDO TODOS OS CARROS DA LISTA -----");

        for(Carro carroDaVez : minhaGaragem){
            carroDaVez.exibir();
        }
    }
}
/* O que muda entre os dois construtores:
           O construtor com parâmetros obriga a passar os dados na hora de instanciar, garantindo um carro completo.
           O construtor sem parâmetros (sobrecarg) dá a flexibilidade de criar o carro "vazio" com valores neutros,
           podendo ser preenchido futuramente através dos métodos setters.
        */