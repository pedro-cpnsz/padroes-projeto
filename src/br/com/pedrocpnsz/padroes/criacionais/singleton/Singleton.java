package br.com.pedrocpnsz.padroes.criacionais.singleton;

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
