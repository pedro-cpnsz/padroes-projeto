package br.com.pedrocpnsz.padroes.criacionais.factorymethod;

/**
 *
 * @author villaca
 */
public class LogisticaTerrestre extends Logistica {

    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }

}
