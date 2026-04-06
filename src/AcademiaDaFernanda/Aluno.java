package AcademiaDaFernanda;

public class Aluno {
    private String nome;
    private int idade;
    private String plano;

    public Aluno(String nome, int idade, String plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPlano() {
        return plano;
    }
}