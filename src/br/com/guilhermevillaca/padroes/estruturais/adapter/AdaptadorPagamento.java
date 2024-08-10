package br.com.guilhermevillaca.padroes.estruturais.adapter;

public class AdaptadorPagamento implements SistemaPagamentoNovo {

    private SistemaPagamentoAntigo sisPagAntigo;

    public AdaptadorPagamento(SistemaPagamentoAntigo sisPagAntigo) {
        this.sisPagAntigo = sisPagAntigo;
    }

    @Override
    public void processarPagamento(String clienteId, double valor) {
        sisPagAntigo.realizarPagamento(clienteId, valor);
    }

}
