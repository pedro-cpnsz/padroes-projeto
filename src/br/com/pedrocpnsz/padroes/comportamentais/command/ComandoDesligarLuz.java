package br.com.pedrocpnsz.padroes.comportamentais.command;

public class ComandoDesligarLuz implements Comando {

    private Luz luz;

    public ComandoDesligarLuz(Luz luz) {
        this.luz = luz;
    }
    
    @Override
    public void executar() {
        luz.desligar();
    }

}
