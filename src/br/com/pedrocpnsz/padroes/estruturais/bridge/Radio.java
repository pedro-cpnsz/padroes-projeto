package br.com.pedrocpnsz.padroes.estruturais.bridge;

public class Radio implements Dispositivo {

    private boolean ligado = false;
    private int volume = 10;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Radio ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Radio desligado.");
    }

    @Override
    public void aumentarVolume() {
        if (ligado && volume < 100) {
            volume++;
            System.out.println("Volume do radio: " + volume);
        } else {
            System.out.println("Radio esta desligado.");
        }
    }

    @Override
    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume--;
            System.out.println("Volume do radio: " + volume);
        } else {
            System.out.println("Radio esta desligado.");
        }
    }

    @Override
    public boolean ligado() {
        return ligado;
    }

    @Override
    public void silenciar() {
        volume = 0;
    }

}
