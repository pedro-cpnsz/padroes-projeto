package br.com.guilhermevillaca.padroes.estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Gestor implements Empregado{
    
    private String nome, cargo;
    private List<Empregado> subordinados;

    public Gestor(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(Empregado empregado) {
        this.subordinados.add(empregado);
    }
    
    public void removerSubordinado(Empregado empregado) {
        this.subordinados.remove(empregado);
    }
    
    @Override
    public void mostrarDetalhes() {
        System.out.println(nome + " - " + cargo);
        for(Empregado subordinado : subordinados) {
            subordinado.mostrarDetalhes();
        }
    }
}
