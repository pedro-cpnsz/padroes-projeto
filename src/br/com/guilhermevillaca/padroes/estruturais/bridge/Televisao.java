package br.com.guilhermevillaca.padroes.estruturais.bridge;

public class Televisao implements Dispositivo {

    private boolean ligado = false;
    private int volume = 10;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Televisao ligada.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Televisao desligada.");
    }

    @Override
    public void aumentarVolume() {
        if (ligado && volume < 100) {
            volume++;
            System.out.println("Volume da TV: " + volume);
        } else {
            System.out.println("Televisao esta desligada.");
        }
    }

    @Override
    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume--;
            System.out.println("Volume da TV: " + volume);
        }  else {
            System.out.println("Televisao esta desligada.");
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