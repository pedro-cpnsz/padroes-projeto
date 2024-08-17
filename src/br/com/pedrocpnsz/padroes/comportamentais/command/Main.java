package br.com.pedrocpnsz.padroes.comportamentais.command;

public class Main {

    public static void main(String[] args) {
        
        Luz luz = new Luz();
        Comando ligarLuz = new ComandoLigarLuz(luz);
        Comando desligarLuz = new ComandoDesligarLuz(luz);
        
        ControleRemoto controle = new ControleRemoto();
        
        controle.setComando(ligarLuz);
        controle.pressionarBotao();
        
        controle.setComando(desligarLuz);
        controle.pressionarBotao();
    }

}
