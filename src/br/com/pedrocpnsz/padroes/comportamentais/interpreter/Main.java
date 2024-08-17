package br.com.pedrocpnsz.padroes.comportamentais.interpreter;

public class Main {

    public static void main(String[] args) {
        
        String comando = "WAWDWDWAWWW";
        Interpreter interpretador = new Interpreter();
        interpretador.interpretar(comando);
    }
    
}
