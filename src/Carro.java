import java.util.ArrayList;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    static int totalCarros = 0;

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
        if (marca == null || modelo == null || anoFabricacao < 1886 || anoFabricacao > 2026) {
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

    public int idadeDoCarro(){
        return 2026 - anoFabricacao;
    }

public static void main(String[] args) {

    ArrayList<Carro> minhaGaragem = new ArrayList<>();

    minhaGaragem.add(new Carro("Honda", "Civic", 1886));
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
/*
Acessamos com Carro.totalCarros (nome da classe) porque atributos static pertencem à classe como um todo e não a um objeto especifico.

Atributo de Instância (Ex: marca, modelo): Cada objeto tem sua própria cópia. Se eu alterar a marca de um carro, o outro não muda.
Atributo Static (Ex: totalCarros): É compartilhado por todos os objetos daquela classe. Existe apenas uma única variável na memória que todos "enxergam" e alteram juntos. É por isso que ela funciona como um contador global.
 */