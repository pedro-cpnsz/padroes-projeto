package br.com.pedrocpnsz.padroes.criacionais.factorymethod;

/**
 *
 * @author villaca
 */
public class LogisticaFerroviaria extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteFerroviario();
    }

}
