package br.com.pedrocpnsz.padroes.estruturais.decorator;

public class Acucar extends CafeDecorator {
    
    public Acucar(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double getCusto() {
        return cafe.getCusto() + 1.00;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " Com acucar.";
    }
    
}
