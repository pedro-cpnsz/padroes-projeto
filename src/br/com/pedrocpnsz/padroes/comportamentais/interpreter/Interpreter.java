package br.com.pedrocpnsz.padroes.comportamentais.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Interpreter {
    
    private Map<Character, Comando> comandos;
    
    public Interpreter() {
        comandos = new HashMap<>();
        comandos.put('W', new AndarParaFrente());
        comandos.put('A', new VirarEsquerda());
        comandos.put('D', new VirarDireita());
    }
    
    public void interpretar(String instrucoes) {
        for (char codigo : instrucoes.toCharArray()) {
            Comando comando = comandos.get(codigo);
            if (comando != null) {
                comando.executar();
            }
        }
    }
}
