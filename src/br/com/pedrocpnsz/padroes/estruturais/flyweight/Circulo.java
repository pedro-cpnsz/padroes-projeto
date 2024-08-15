package br.com.pedrocpnsz.padroes.estruturais.flyweight;

public class Circulo implements Forma {

    private String cor;
    private int x, y, raio;

    public Circulo(String cor) {
        this.cor = cor;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    @Override
    public void desenhar() {
        System.out.println("Desenhando circulo... [Cor: " + cor + ", x: " + x + ", y: " + y + ", raio: " + raio + "]");
    }

}
