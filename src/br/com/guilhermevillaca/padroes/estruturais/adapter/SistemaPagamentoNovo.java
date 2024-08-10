package br.com.guilhermevillaca.padroes.estruturais.adapter;

public interface SistemaPagamentoNovo {

    void processarPagamento(String clienteId, double valor);
}
