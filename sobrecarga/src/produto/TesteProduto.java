package produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta");
        Produto p2 = new Produto("Caderno", 15.90);
        Produto p3 = new Produto("Mochila", 129.99, 25);

        p1.exibirInformacoes();
        System.out.println();
        p2.exibirInformacoes();
        System.out.println();
        p3.exibirInformacoes();
    }
}
