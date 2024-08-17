package br.com.pedrocpnsz.padroes.estruturais.proxy;

public class ProxyDocumento implements Documento{

    private DocumentoReal documentoReal;
    private String nomeArquivo;

    public ProxyDocumento(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    @Override
    public void exibir() {
        if (documentoReal == null) {
            documentoReal = new DocumentoReal(nomeArquivo);
        }
        documentoReal.exibir();
    }

}
