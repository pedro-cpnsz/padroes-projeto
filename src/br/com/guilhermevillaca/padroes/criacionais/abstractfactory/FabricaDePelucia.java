package br.com.guilhermevillaca.padroes.criacionais.abstractfactory;

import br.com.guilhermevillaca.padroes.criacionais.abstractfactory.bichos.RaposaDePelucia;
import br.com.guilhermevillaca.padroes.criacionais.abstractfactory.bichos.Raposa;
import br.com.guilhermevillaca.padroes.criacionais.abstractfactory.bichos.Ursinho;
import br.com.guilhermevillaca.padroes.criacionais.abstractfactory.bichos.UrsinhoDePelucia;
import br.com.guilhermevillaca.padroes.criacionais.abstractfactory.bichos.CoelhoDePelucia;
import br.com.guilhermevillaca.padroes.criacionais.abstractfactory.bichos.Coelho;
import br.com.guilhermevillaca.padroes.criacionais.abstractfactory.bichos.Porco;
import br.com.guilhermevillaca.padroes.criacionais.abstractfactory.bichos.PorcoDePelucia;

/**
 *
 * @author guilherme.villaca
 */
public class FabricaDePelucia implements FabricaDeBrinquedo{

    @Override
    public Ursinho criarUrsinho() {
        return new UrsinhoDePelucia();
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoDePelucia();
    }

    @Override
    public Raposa criarRaposa() {
        return new RaposaDePelucia();
    }

    @Override
    public Porco criarPorco() {
        return new PorcoDePelucia();
    }

}
