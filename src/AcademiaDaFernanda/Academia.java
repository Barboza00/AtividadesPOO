package AcademiaDaFernanda;

import java.util.ArrayList;

public class Academia {

    // Constante para o limite de alunos (nunca muda)
    public static final int MAX_ALUNOS = 50;

    // Contador global de matriculados
    public static int totalMatriculados = 0;

    private ArrayList<Aluno> listaDeAlunos;

    public Academia() {
        this.listaDeAlunos = new ArrayList<>();
    }

    // Método que já faz as validações pedidas no exercício
    public void matricularAluno(String nome, int idade, String plano) {
        if (totalMatriculados >= MAX_ALUNOS) {
            System.out.println("❌ Lotação máxima! A academia já atingiu o limite de " + MAX_ALUNOS + " alunos.");
        } else if (idade < 14) {
            System.out.println("❌ Matrícula bloqueada: A idade mínima exigida é de 14 anos.");
        } else {
            Aluno novoAluno = new Aluno(nome, idade, plano);
            listaDeAlunos.add(novoAluno);
            totalMatriculados++; // Sobe o contador estático
            System.out.println("✅ Aluno(a) " + nome + " matriculado(a) com sucesso no plano " + plano + "!");
        }
    }

    public void listarAlunos() {
        if (listaDeAlunos.isEmpty()) {
            System.out.println("⚠️ Nenhum aluno matriculado ainda.");
        } else {
            System.out.println("\n🏋️ --- ALUNOS MATRICULADOS ---");
            for (Aluno a : listaDeAlunos) {
                System.out.println("- " + a.getNome() + " | Idade: " + a.getIdade() + " | Plano: " + a.getPlano());
            }
            System.out.println("-----------------------------");
        }
    }
}