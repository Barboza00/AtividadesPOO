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
    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public static void trocarModelo(Carro c) {
        c.setModelo("Fusca");
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("VW", "Gol", 2015);
        trocarModelo(meuCarro);
        System.out.println(meuCarro.getModelo());
    }
    // a) Fusca
    // b) A mudança afetou o objeto original porque objetos em Java são passados por referência.
    // O parâmetro c aponta exatamente para o mesmo endereço de memória no Heap onde o objeto meuCarro está armazenado.
    // Como ambos manipulam o mesmo objeto, a alteração feita dentro do método persiste fora dele.


/*
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
    }*/
}