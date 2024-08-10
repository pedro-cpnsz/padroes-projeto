package br.com.pedrocpnsz.padroes.estruturais.decorator;

public class Main {

    public static void main(String[] args) {
        
        Cafe cafeSimples = new CafeSimples();
        System.out.println(cafeSimples.getDescricao() + " Custo: " + cafeSimples.getCusto());
        
        cafeSimples = new Leite(cafeSimples);
        System.out.println(cafeSimples.getDescricao() + " Custo: " + cafeSimples.getCusto());
        
        cafeSimples = new Acucar(cafeSimples);
        System.out.println(cafeSimples.getDescricao() + " Custo: " + cafeSimples.getCusto());
    }
    
}
