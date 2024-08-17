package br.com.pedrocpnsz.padroes.estruturais.proxy;

public class Main {

    public static void main(String[] args) {
        Documento documento = new ProxyDocumento("Teste.pdf");
        documento.exibir();
        documento.exibir();
    }
    
}
