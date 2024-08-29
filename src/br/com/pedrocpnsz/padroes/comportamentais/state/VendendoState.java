package br.com.pedrocpnsz.padroes.comportamentais.state;

public class VendendoState implements State {

    private MaquinaVenda maquinaVenda;

    public VendendoState(MaquinaVenda maquinaVenda) {
        this.maquinaVenda = maquinaVenda;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Aguarde, estamos processando uma venda.");
        maquinaVenda.setEstado(maquinaVenda.getComMoedaState());
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Estamos processando uma venda, nao");
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Alavanca já foi acionada.");
    }

    @Override
    public void dispensarProduto() {
        maquinaVenda.liberarProuto();
        if (maquinaVenda.getQuantidade() > 0) {
            maquinaVenda.setEstado(maquinaVenda.getSemMoedaState());
        } else {
            maquinaVenda.setEstado(maquinaVenda.getSemEstoqueState());
        }
    }
}
