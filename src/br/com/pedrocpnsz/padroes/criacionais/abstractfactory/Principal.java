package br.com.pedrocpnsz.padroes.criacionais.abstractfactory;

import br.com.pedrocpnsz.padroes.criacionais.abstractfactory.bichos.Raposa;
import br.com.pedrocpnsz.padroes.criacionais.abstractfactory.bichos.Ursinho;
import br.com.pedrocpnsz.padroes.criacionais.abstractfactory.bichos.Coelho;

/**
 *
 * @author guilherme.villaca
 */
public class Principal {

    public static void main(String[] args) {
        
        FabricaDeBrinquedo fabricaPelucia = new FabricaDePelucia();
        Coelho coelhoPelucia = fabricaPelucia.criarCoelho();
        Ursinho ursoPelucia = fabricaPelucia.criarUrsinho();
        Raposa raposaPelucia = fabricaPelucia.criarRaposa();
        coelhoPelucia.exibir();
        ursoPelucia.exibir();
        raposaPelucia.exibir();
        
        FabricaDeBrinquedo fabricaPlastico = new FabricaDePlastico();
        Coelho coelhoPlastico = fabricaPlastico.criarCoelho();
        Ursinho ursoPlastico = fabricaPlastico.criarUrsinho();
        Raposa raposaPlastico = fabricaPlastico.criarRaposa();
        coelhoPlastico.exibir();
        ursoPlastico.exibir();
        raposaPlastico.exibir();
        
        
        
    }
}
