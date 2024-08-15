package br.com.pedrocpnsz.padroes.estruturais.facade;

public class ComputadorFacade {
    
    private Memoria memoria;
    private Dispositivo dispositivo;
    private SistemaOperacional sistemaOperacional;

    public ComputadorFacade() {
        this.memoria = new Memoria();
        this.dispositivo = new Dispositivo();
        this.sistemaOperacional = new SistemaOperacional();
    }
    
    public void iniciarComputador() {
        System.out.println("Iniciando computador...");
        memoria.verificarMemoria();
        dispositivo.inicializarDispositivo();
        sistemaOperacional.carregarOS();
        System.out.println("Computador iniciado com sucesso!");
    }
}
