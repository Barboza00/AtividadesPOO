import java.util.ArrayList;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    static int totalCarros = 0;
    static final int ANO_PRIMEIRO_CARRO = 1886;

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    
    public Carro(String marca, String modelo, int anoFabricacao) {
        if (marca == null || modelo == null || anoFabricacao < ANO_PRIMEIRO_CARRO || anoFabricacao > 2026){
            System.out.println("Erro: Marca(e/ou) Ano invalido");
            return;
        }
        totalCarros++;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao =  anoFabricacao;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.anoFabricacao = 0;
        totalCarros++;
    }

    public void exibir(){
        System.out.println("Carro: " + marca + " " + modelo + " - Ano: " + anoFabricacao);
    }

    public static void imprimirTotal(){
        System.out.println(totalCarros);
    }

    public int idadeDoCarro(){
        return 2026 - anoFabricacao;
    }

public static void main(String[] args) {

    /*
    Escopo é a região do código onde uma variável é visível e pode ser acessada.
    Em Java, uma variável só existe dentro do bloco de chaves { } onde foi criada.
    No código do exercício, o x tinha escopo local ao if, por isso 'morria' assim que o if terminava.
    Para funcionar, precisamos mover a declaração para o escopo do método main, que engloba tanto o if quanto o println.
     */
    int x = 10;
    if (true) {
    }
    System.out.println(x);

    ArrayList<Carro> minhaGaragem = new ArrayList<>();

    minhaGaragem.add(new Carro("Honda", "Civic", 1990));
    minhaGaragem.add(new Carro("Ford", "Maverick", 2000));
    minhaGaragem.add(new Carro("Toyota", "Corolla", 2010));
    minhaGaragem.add(new Carro("Chevrolet", "Cruze", 2024));
    minhaGaragem.add(new Carro());

        System.out.println("----- EXIBINDO TODOS OS CARROS DA LISTA -----");
        System.out.println("O total de carros na garagem é: " + Carro.totalCarros);

        for(Carro carroDaVez : minhaGaragem){
            carroDaVez.exibir();
        }
    }
}