package br.com.pedrocpnsz.padroes.estruturais.bridge;

public class Main {

    public static void main(String[] args) {
        
        Dispositivo tvTubo = new Televisao();
        ControleRemoto controleBasicoTvTubo = new ControleRemotoBasico(tvTubo);
        
        System.out.println("Usando controle basico.");
        controleBasicoTvTubo.ligarDesligar();
        controleBasicoTvTubo.aumentarVolume();
        controleBasicoTvTubo.diminuirVolume();
        controleBasicoTvTubo.ligarDesligar();
        
        
        Dispositivo radio = new Radio();
        ControleRemoto controleBasicoRadio = new ControleRemotoBasico(radio);
        
        System.out.println("Usando controle basico.");
        controleBasicoRadio.ligarDesligar();
        controleBasicoRadio.aumentarVolume();
        controleBasicoRadio.diminuirVolume();
        controleBasicoRadio.silenciar();
        controleBasicoRadio.ligarDesligar();
        
        
        Dispositivo jbl = new Radio();
        ControleRemoto controleAvancadoJbl = new ControleRemotoAvancado(jbl);
        
        System.out.println("Usando controle avancado.");
        controleAvancadoJbl.ligarDesligar();
        controleAvancadoJbl.aumentarVolume();
        controleAvancadoJbl.diminuirVolume();
        controleAvancadoJbl.ligarDesligar();
        
        
        Dispositivo tv = new Televisao();
        ControleRemoto controleAvancadoTv = new ControleRemotoAvancado(tv);
        
        System.out.println("Usando controle avancado.");
        controleAvancadoTv.ligarDesligar();
        controleAvancadoTv.aumentarVolume();
        controleAvancadoTv.diminuirVolume();
        controleAvancadoTv.silenciar();
        controleAvancadoTv.ligarDesligar();
    }
    
}
