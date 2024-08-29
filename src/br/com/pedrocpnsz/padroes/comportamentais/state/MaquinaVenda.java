package br.com.pedrocpnsz.padroes.comportamentais.state;

public class MaquinaVenda {

    private State semMoedaState, comMoedaState, vendendoState, semEstoqueState, estadoAtual;
    private int quantidade;

    public MaquinaVenda(int quantidade) {
        this.semMoedaState = new SemMoedaState(this);
        this.comMoedaState = new ComMoedaState(this);
        this.vendendoState = new VendendoState(this);
        this.semEstoqueState = new SemEstoqueState(this);
        this.quantidade = quantidade;
        if (quantidade > 0) {
            estadoAtual = semMoedaState;
        } else {
            estadoAtual = semEstoqueState;
        }
    }
    
    public void setEstado(State novoEstado) {
        estadoAtual = novoEstado;
    }
    
    public void inserirMoeda() {
        estadoAtual.inserirMoeda();
    }
    
    public void ejetarMoeda() {
        estadoAtual.ejetarMoeda();
    }
    
    public void acionarAlavanca() {
        estadoAtual.acionarAlavanca();
        estadoAtual.dispensarProduto();
    }
    
    public void liberarProuto() {
        if (quantidade > 0) {
            System.out.println("Um produto foi liberado");
            quantidade--;
        } else {
            
        }
    }

    public State getSemMoedaState() {
        return semMoedaState;
    }

    public void setSemMoedaState(State semMoedaState) {
        this.semMoedaState = semMoedaState;
    }

    public State getComMoedaState() {
        return comMoedaState;
    }

    public void setComMoedaState(State comMoedaState) {
        this.comMoedaState = comMoedaState;
    }

    public State getVendendoState() {
        return vendendoState;
    }

    public void setVendendoState(State vendendoState) {
        this.vendendoState = vendendoState;
    }

    public State getSemEstoqueState() {
        return semEstoqueState;
    }

    public void setSemEstoqueState(State semEstoqueState) {
        this.semEstoqueState = semEstoqueState;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
