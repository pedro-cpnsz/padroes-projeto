package br.com.pedrocpnsz.padroes.comportamentais.interpreter;

public class VirarEsquerda implements Comando {

    @Override
    public void executar() {
        System.out.println("Virar para a esquerda.");
    }

}
