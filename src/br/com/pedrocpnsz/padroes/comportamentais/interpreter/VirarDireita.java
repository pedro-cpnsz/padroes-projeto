package br.com.pedrocpnsz.padroes.comportamentais.interpreter;

public class VirarDireita implements Comando {

    @Override
    public void executar() {
        System.out.println("Virar para a direita.");
    }

}
