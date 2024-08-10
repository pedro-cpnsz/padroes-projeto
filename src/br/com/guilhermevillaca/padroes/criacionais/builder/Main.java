package br.com.guilhermevillaca.padroes.criacionais.builder;

public class Main {

    public static void main(String[] args) {
        Casa casaSimples = new Builder()
                .comParedes("Paredes de tijolos.")
                .comTelhado("Telhado de telha.")
                .build();
        System.out.println("Casa simples.");
        System.out.println("Paredes: " + casaSimples.getParedes());
        System.out.println("Telhado: " + casaSimples.getTelhado());

        System.out.println("-------------------------------------------------");

        Casa casaCompleta = new Builder()
                .comParedes("Paredes de tijolos.")
                .comTelhado("Telhado de telha.")
                .comPortas("Porta de madeira.")
                .comJanelas("Janelas de vidro.")
                .build();
        System.out.println("Casa completa.");
        System.out.println("Paredes: " + casaCompleta.getParedes());
        System.out.println("Telhado: " + casaCompleta.getTelhado());
        System.out.println("Portas: " + casaCompleta.getPortas());
        System.out.println("Janelas: " + casaCompleta.getJanelas());

    }

}
