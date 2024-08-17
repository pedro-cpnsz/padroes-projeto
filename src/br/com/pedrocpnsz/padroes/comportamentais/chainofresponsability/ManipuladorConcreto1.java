package br.com.pedrocpnsz.padroes.comportamentais.chainofresponsability;

public class ManipuladorConcreto1 extends Manipulador {

    @Override
    public void tratarRequisicao(String requisicao) {
        if(requisicao.equals("Requisicao1")) {
            System.out.println("Manipulador 1 tratou a requisicao.");
        } else if (proximo != null) {
            proximo.tratarRequisicao(requisicao);
        }
    }

}
