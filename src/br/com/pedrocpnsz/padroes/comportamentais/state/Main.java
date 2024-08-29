package br.com.pedrocpnsz.padroes.comportamentais.state;

public class Main {

    public static void main(String[] args) {
        
        MaquinaVenda maquinaVenda = new MaquinaVenda(10);
        
        maquinaVenda.acionarAlavanca();
        
        maquinaVenda.inserirMoeda();
        maquinaVenda.acionarAlavanca();
        
        maquinaVenda.inserirMoeda();
        maquinaVenda.ejetarMoeda();
        
        maquinaVenda.inserirMoeda();
        maquinaVenda.acionarAlavanca();
        
        maquinaVenda.inserirMoeda();
    }
    
}
