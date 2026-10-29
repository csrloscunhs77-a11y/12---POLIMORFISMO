package pagamento;

public class TestePagamento {
    public static void main(String[] args) {
        Pagamento generico = new Pagamento();
        Pagamento cartao = new PagamentoCartao();
        Pagamento boleto = new PagamentoBoleto();

        Pagamento[] pagamentos = { generico, cartao, boleto };
        for (Pagamento p : pagamentos) {
            p.processarPagamento();
        }
    }
}
