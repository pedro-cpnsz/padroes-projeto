package br.com.guilhermevillaca.padroes.estruturais.adapter;

public class Main {

    public static void main(String[] args) {

        SistemaPagamentoAntigo sisPagAntigo = new SistemaPagamentoAntigo();
        SistemaPagamentoNovo sisPagNovo = new AdaptadorPagamento(sisPagAntigo);

        sisPagNovo.processarPagamento("1234", 1999.99);
    }

}
