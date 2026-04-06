public class Cliente {

    String nome;
    String email;
    String telefone;

    public static int totalClientes = 0;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        totalClientes++;
    }
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = "Não informado";
        totalClientes++;
    }
    public Cliente(String nome) {
        this.nome = nome;
        this.email = "Não informado";
        this.telefone = "Não  informado";
        totalClientes++;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }

    public static void main(String[] args) {
    Cliente c1 = new Cliente("Carlito", "carlito@email.com", "65912345678");
    Cliente c2 = new Cliente("Victor", "victor@email.com");
    Cliente c3 = new Cliente("Adonis");

    c1.imprimirDados();
    c2.imprimirDados();
    c3.imprimirDados();

    System.out.println("\n Número de clientes cadastrados: " + Cliente.totalClientes);
    }
}