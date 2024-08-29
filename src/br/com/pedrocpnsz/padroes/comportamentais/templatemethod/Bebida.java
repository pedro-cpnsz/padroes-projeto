package br.com.pedrocpnsz.padroes.comportamentais.templatemethod;

public abstract class Bebida {
    
    public final void preparar() {
        ferverAgua();
        adicionarIngredientePrincipal();
        adicionarIngredientesExtras();
        servir();
    }
    
    private void ferverAgua(){
        System.out.println("Fervendo agua.");
    }
    
    protected abstract void adicionarIngredientePrincipal();
    
    protected abstract void adicionarIngredientesExtras();
    
    private void servir() {
        System.out.println("Servindo bebida.\n");
    }
}
