package br.com.pedrocpnsz.padroes.comportamentais.observer;

public interface Sujeito {
    
    void adicionarObservador(Observer observador);
    
    void removeObservador(Observer observador);
    
    void notificarObservadores();
}
