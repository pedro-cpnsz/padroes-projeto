package br.com.pedrocpnsz.padroes.comportamentais.memento;

public class Main {

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        editor.escrever("Teste 1 ");
        historico.salvarMemento(editor.salvar());
        editor.escrever("Teste 2 ");
        historico.salvarMemento(editor.salvar());
        editor.escrever("Teste 3");
        
        System.out.println("Texto atual: " + editor.mostrarTexto());
        
        editor.desfazer(historico.desfazer());
        System.out.println("Apos desfazer: " + editor.mostrarTexto());
        
        editor.desfazer(historico.desfazer());
        System.out.println("Apos desfazer novamente: " + editor.mostrarTexto());
    }

}
