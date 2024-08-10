package br.com.pedrocpnsz.padroes.criacionais.abstractfactory;

import br.com.pedrocpnsz.padroes.criacionais.abstractfactory.bichos.Raposa;
import br.com.pedrocpnsz.padroes.criacionais.abstractfactory.bichos.Ursinho;
import br.com.pedrocpnsz.padroes.criacionais.abstractfactory.bichos.Coelho;
import br.com.pedrocpnsz.padroes.criacionais.abstractfactory.bichos.Porco;

/**
 *
 * @author guilherme.villaca
 */
public interface FabricaDeBrinquedo {
    
    Ursinho criarUrsinho();
    
    Coelho criarCoelho();
    
    Raposa criarRaposa();
    
    Porco criarPorco();

}
