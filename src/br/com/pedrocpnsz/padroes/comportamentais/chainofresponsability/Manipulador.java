package br.com.pedrocpnsz.padroes.comportamentais.chainofresponsability;

public abstract class Manipulador {
    
    protected Manipulador proximo;
    
    public void setProximo(Manipulador proximo) {
        this.proximo = proximo;
    }
    
    public abstract void tratarRequisicao(String requisicao);
}
