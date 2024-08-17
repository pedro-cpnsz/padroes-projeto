package br.com.pedrocpnsz.padroes.comportamentais.command;

public class ComandoLigarLuz implements Comando {

    private Luz luz;

    public ComandoLigarLuz(Luz luz) {
        this.luz = luz;
    }
    
    @Override
    public void executar() {
        luz.ligar();
    }

}
