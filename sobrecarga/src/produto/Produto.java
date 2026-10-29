package produto;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Estoque: " + estoque + " unidade(s)");
    }
}
