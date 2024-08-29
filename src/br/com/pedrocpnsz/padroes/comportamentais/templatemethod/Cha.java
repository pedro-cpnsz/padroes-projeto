package br.com.pedrocpnsz.padroes.comportamentais.templatemethod;

public class Cha extends Bebida {

    @Override
    protected void adicionarIngredientePrincipal() {
        System.out.println("Adicioar saquinho de cha.");
    }

    @Override
    protected void adicionarIngredientesExtras() {
        System.out.println("Adicionar adocante.");
    }

}
