/*
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
 */

public class Carro {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 99;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
Alterar b não mudou a porque int é um tipo primitivo.
Em tipos primitivos, o Java realiza uma atribuição por valor, criando uma cópia independente na memória.
Portanto, qualquer alteração em b não afeta o valor original de a.
 */