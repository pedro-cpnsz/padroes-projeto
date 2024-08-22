package br.com.pedrocpnsz.padroes.comportamentais.iterator;

public interface ColecaoAgregada<T> {
    
    Iterator<T> criarIterator();
}
