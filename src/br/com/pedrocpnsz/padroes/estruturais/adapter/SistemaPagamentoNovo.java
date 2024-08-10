package br.com.pedrocpnsz.padroes.estruturais.adapter;

public interface SistemaPagamentoNovo {

    void processarPagamento(String clienteId, double valor);
}
