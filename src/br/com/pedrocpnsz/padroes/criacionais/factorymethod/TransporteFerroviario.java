package br.com.pedrocpnsz.padroes.criacionais.factorymethod;

/**
 *
 * @author villaca
 */
public class TransporteFerroviario implements Transporte{

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte ferroviário.");
    }

}
