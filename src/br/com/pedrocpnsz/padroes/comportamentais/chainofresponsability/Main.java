package br.com.pedrocpnsz.padroes.comportamentais.chainofresponsability;

public class Main {

    public static void main(String[] args) {
        Manipulador manipulador1 = new ManipuladorConcreto1();
        Manipulador manipulador2 = new ManipuladorConcreto2();
        Manipulador manipulador3 = new ManipuladorConcreto3();
        
        manipulador1.setProximo(manipulador2);
        manipulador2.setProximo(manipulador3);
        
        manipulador1.tratarRequisicao("Requisicao1");
        manipulador1.tratarRequisicao("Requisicao2");
        manipulador1.tratarRequisicao("Requisicao3");
        manipulador1.tratarRequisicao("Requisicao4");
    }
    
}
