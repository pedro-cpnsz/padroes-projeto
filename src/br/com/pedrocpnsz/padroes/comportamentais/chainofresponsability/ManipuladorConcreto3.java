package br.com.pedrocpnsz.padroes.comportamentais.chainofresponsability;

public class ManipuladorConcreto3 extends Manipulador {

    @Override
    public void tratarRequisicao(String requisicao) {
        if(requisicao.equals("Requisicao3")) {
            System.out.println("Manipulador 3 tratou a requisicao.");
        } else if (proximo != null) {
            proximo.tratarRequisicao(requisicao);
        }
    }

}
