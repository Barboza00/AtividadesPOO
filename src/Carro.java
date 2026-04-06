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

public static void main(String[] args) {

/*
a) Ambos serão "Palio".
b) Eles compartilham o mesmo endereço de memória (o mesmo objeto no Heap).
c) No Ex 11, o valor fica na Stack (independente). No Ex 12, as variáveis na Stack são apenas referências para o objeto real que fica no Heap.
*/
    Carro c1 = new Carro("Fiat", "Uno", 2000);
    Carro c2 = c1;
    c2.setModelo("Palio");
    System.out.println(c1.getModelo());
    System.out.println(c2.getModelo());
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
        } */
    }
}