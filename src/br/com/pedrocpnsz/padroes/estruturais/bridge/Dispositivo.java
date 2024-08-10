package br.com.pedrocpnsz.padroes.estruturais.bridge;

public interface Dispositivo {
    
    void ligar();
    
    void desligar();
    
    void aumentarVolume();
    
    void diminuirVolume();
    
    void silenciar();
    
    boolean ligado();
}
