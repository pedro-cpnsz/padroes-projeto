package br.com.guilhermevillaca.padroes.criacionais.singleton;

public class Singleton {
    private static Singleton instancia;
    
    private Singleton(){
        
    }
    
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
    
    public void exibirMensagem() {
        System.out.println("Mensagem padrao de instancia Singleton.");
    }
}
