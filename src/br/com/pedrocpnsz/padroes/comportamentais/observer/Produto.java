package br.com.pedrocpnsz.padroes.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Produto implements Sujeito {

    private String nome;
    private int quantidade;
    private List<Observer> observadores;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.observadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        notificarObservadores();
    }

    @Override
    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void removeObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(nome, quantidade);
        }
    }

}
