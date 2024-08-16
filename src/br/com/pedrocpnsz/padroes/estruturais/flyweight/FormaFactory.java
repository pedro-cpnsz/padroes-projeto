package br.com.pedrocpnsz.padroes.estruturais.flyweight;

import java.util.HashMap;

public class FormaFactory {
    
    private static final HashMap<String, Forma> circuloMap = new HashMap<>();
    
    public static Forma getCirculo(String cor) {
        Circulo circulo = (Circulo) circuloMap.get(cor);
        
        if (circulo == null) {
            circulo = new Circulo(cor);
            circuloMap.put(cor, circulo);
            System.out.println("Criando circulo da cor: " + cor);
        } else {
            System.out.println("---------");
            System.out.println("Retorna mesmo objeto.");
            System.out.println("---------");
        }
        return circulo;
    }
}
