package br.com.pedrocpnsz.padroes.comportamentais.iterator;

public class ColecaoDeNomes implements ColecaoAgregada<String> {

    private String[] nomes;

    public ColecaoDeNomes(String[] nomes) {
        this.nomes = nomes;
    }

    @Override
    public Iterator<String> criarIterator() {
        return new IteradorDeNomes();
    }

    private class IteradorDeNomes implements Iterator<String> {

        private int i = 0;

        @Override
        public boolean temProximo() {
            return i < nomes.length;
        }

        @Override
        public String proximo() {
            if (temProximo()) {
                return nomes[i++];
            }
            return null;
        }

    }

}
