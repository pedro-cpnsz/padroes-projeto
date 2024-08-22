package br.com.pedrocpnsz.padroes.comportamentais.iterator;

public class Main {

    public static void main(String[] args) {

        String[] nomes = {"Pedro", "Cesar", "Jair", "Luiz"};
        ColecaoDeNomes colecao = new ColecaoDeNomes(nomes);

        Iterator<String> iterador = colecao.criarIterator();

        while (iterador.temProximo()) {
            System.out.println(iterador.proximo());
        }

    }

}
