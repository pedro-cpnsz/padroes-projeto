package br.com.pedrocpnsz.padroes.comportamentais.templatemethod;

public class Main {

    public static void main(String[] args) {
        
        Bebida cha = new Cha();
        
        System.out.println("Preparando cha...");
        cha.preparar();
        
        Bebida cafe = new Cafe();
        System.out.println("Preparando cafe...");
        cafe.preparar();
    }
    
}
