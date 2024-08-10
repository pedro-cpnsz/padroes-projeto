package br.com.guilhermevillaca.padroes.criacionais.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();
        
        System.out.println("Instacia 1: ");
        singleton1.exibirMensagem();
        
        System.out.println("Instacia 2: ");
        singleton2.exibirMensagem();
        
        System.out.println("----------------------------------------");
        
        if (singleton1 == singleton2) {
            System.out.println("As instancias sao iguais.");
        } else {
            System.out.println("As instancias sao diferentes.");
        }
    }
    
}
