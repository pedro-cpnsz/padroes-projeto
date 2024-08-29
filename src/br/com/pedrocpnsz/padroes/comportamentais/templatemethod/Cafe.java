package br.com.pedrocpnsz.padroes.comportamentais.templatemethod;

public class Cafe extends Bebida {

    @Override
    protected void adicionarIngredientePrincipal() {
        System.out.println("Adicionar po na agua.");
    }

    @Override
    protected void adicionarIngredientesExtras() {
        System.out.println("Adicionar acucar.");
    }

}
