
public class Carro {
    String marca;
    String modelo;
    int anoFabricacao;

    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void exibir(){
        System.out.println("Carro: " + marca + " " + modelo + " - Ano: " + anoFabricacao);
    }

    public int idadeDoCarro(){
        return 2026 - anoFabricacao;
    }

public static void main(String[] args) {
    Carro carro1 = new Carro("Honda", "Civic", 2016);
    Carro carro2 = new Carro("Volkswagem", "Jetta", 2010);

    //Executa ação pois é um metodo "void".
    carro1.exibir();
    carro2.exibir();

    //Devolve valor pois ele retorna um "int".
    System.out.println("Idade do Honda: " + carro1.idadeDoCarro() + " anos.");
    System.out.println("Idade do Honda: " + carro2.idadeDoCarro() + " anos.");
    }
}