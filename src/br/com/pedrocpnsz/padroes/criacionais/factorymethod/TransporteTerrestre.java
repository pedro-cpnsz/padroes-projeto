package br.com.pedrocpnsz.padroes.criacionais.factorymethod;

/**
 *
 * @author villaca
 */
public class TransporteTerrestre implements Transporte{

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte terrestre.");
    }

}
