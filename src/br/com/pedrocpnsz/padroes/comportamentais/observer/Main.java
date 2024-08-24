package br.com.pedrocpnsz.padroes.comportamentais.observer;

public class Main {

    public static void main(String[] args) {
        
        Produto produto = new Produto("Mouse DELL", 10);
        
        Cliente cliente1 = new Cliente("Jairo");
        Cliente cliente2 = new Cliente("Clara");
        
        produto.adicionarObservador(cliente1);
        produto.adicionarObservador(cliente2);
        
        produto.setQuantidade(8);
        
        produto.removeObservador(cliente1);
        
        produto.setQuantidade(5);
        
        produto.removeObservador(cliente2);
    }
    
}
