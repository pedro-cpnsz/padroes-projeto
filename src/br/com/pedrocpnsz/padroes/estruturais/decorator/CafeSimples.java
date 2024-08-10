package br.com.pedrocpnsz.padroes.estruturais.decorator;

public class CafeSimples implements Cafe {

    @Override
    public String getDescricao() {
        return "Cafe simples.";
    }

    @Override
    public double getCusto() {
        return 5.00;
    }

}
