package br.com.pedrocpnsz.padroes.estruturais.bridge;

public class ControleRemotoBasico extends ControleRemoto {

    public ControleRemotoBasico(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ligarDesligar() {
        if (dispositivo.ligado()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }

    @Override
    public void aumentarVolume() {
        dispositivo.aumentarVolume();
    }

    @Override
    public void diminuirVolume() {
        dispositivo.diminuirVolume();
    }

    @Override
    public void silenciar() {
        dispositivo.silenciar();
        System.out.println("Dispositivo silenciado.");
    }
    
}
