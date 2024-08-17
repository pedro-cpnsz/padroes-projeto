package br.com.pedrocpnsz.padroes.comportamentais.interpreter;

public class AndarParaFrente implements Comando {

    @Override
    public void executar() {
        System.out.println("Andar para frente.");
    }

}
