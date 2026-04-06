package LocadoraDoMarcos;

import java.util.ArrayList;

public class Locadora {
    private ArrayList<Filme> acervo;

    public Locadora() {
        this.acervo = new ArrayList<>();
    }

    public void cadastrarFilme(String titulo, String genero, int ano) {
        Filme novoFilme = new Filme(titulo, genero, ano);
        acervo.add(novoFilme);
        System.out.println("✅ Filme '" + titulo + "' cadastrado com sucesso!");
    }

    public void listarFilmes() {
        if (acervo.isEmpty()) {
            System.out.println("⚠️ O acervo está vazio. Cadastre alguns filmes primeiro.");
        } else {
            System.out.println("\n🎬 --- ACERVO DE FILMES ---");
            for (Filme f : acervo) {
                System.out.println("- " + f.getTitulo() + " (" + f.getAnoLancamento() + ")");
                System.out.println("  Gênero: " + f.getGenero() + " | Categoria: " + f.classificarFilme());
            }
            System.out.println("---------------------------");
        }
    }
}