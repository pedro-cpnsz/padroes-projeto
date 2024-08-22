package br.com.pedrocpnsz.padroes.comportamentais.iterator;

public interface Iterator<T> {
    
    boolean temProximo();
    
    T proximo();
}
