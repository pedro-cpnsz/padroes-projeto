package br.com.pedrocpnsz.padroes.estruturais.decorator;

public class Leite extends CafeDecorator {
    
    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getCusto() {
        return cafe.getCusto() + 2.00;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " Com leite.";
    }
    
}
