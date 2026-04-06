package LocadoraDoMarcos;

public class Filme {

    public static final int ANO_MINIMO = 1895;
    public static int totalFilmes = 0;

    private String titulo;
    private String genero;
    private int anoLancamento;

    public Filme(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        setAnoLancamento(anoLancamento);
        totalFilmes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento < ANO_MINIMO || anoLancamento > 2026) {
            System.out.println("⚠️ Ano inválido! Ajustando automaticamente para o ano mínimo (" + ANO_MINIMO + ").");
            this.anoLancamento = ANO_MINIMO;
        } else {
            this.anoLancamento = anoLancamento;
        }
    }

    public String classificarFilme() {
        if (this.anoLancamento < 2000) {
            return "Clássico";
        } else {
            return "Recente";
        }
    }
}