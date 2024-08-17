package br.com.pedrocpnsz.padroes.comportamentais.chainofresponsability;

public class ManipuladorConcreto2 extends Manipulador {

    @Override
    public void tratarRequisicao(String requisicao) {
        if(requisicao.equals("Requisicao2")) {
            System.out.println("Manipulador 2 tratou a requisicao.");
        } else if (proximo != null) {
            proximo.tratarRequisicao(requisicao);
        }
    }

}
