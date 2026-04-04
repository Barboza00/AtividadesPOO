
public class Carro {
    String marca;
    String modelo;
    int anoFabricacao;

    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

public static void main(String[] args) {
    Carro carro1 = new Carro("Honda", "Civic", 2025);
    Carro carro2 = new Carro("Volkswagem", "Jetta", 2025);

    System.out.println("Carro 1: " + carro1.marca + " " + carro1.modelo + " " + carro1.anoFabricacao);
    System.out.println("Carro 2: " + carro2.marca + " " + carro2.modelo + " " + carro2.anoFabricacao);
    }
}