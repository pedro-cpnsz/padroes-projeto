package br.com.pedrocpnsz.padroes.comportamentais.visitor_;

/**
 *
 * @author guilherme.villaca
 */
public interface Visitante {

    void visitar(Livro livro);

    void visitar(Fruta fruta);
}
