package br.com.guilhermevillaca.padroes.estruturais.composite;

public class Main {

    public static void main(String[] args) {
        
        Empregado funcionario1 = new Funcionario("Pedro", "Dev");
        Empregado funcionario2 = new Funcionario("Juquinha", "PO");
        
        Gestor gestor1 = new Gestor("Marcela", "Team Leader");
        gestor1.adicionarSubordinado(funcionario1);
        gestor1.adicionarSubordinado(funcionario2);
        
        Empregado funcionario3 = new Funcionario("Renata", "Gerente");
        
        Gestor diretor = new Gestor("Marcio", "CEO");
        diretor.adicionarSubordinado(funcionario3);
        diretor.adicionarSubordinado(gestor1);
        
        System.out.println("Organograma da empresa: ");
        diretor.mostrarDetalhes();
    }
    
}
