package br.com.pedrocpnsz.padroes.comportamentais.mediator;

public class Main {

    public static void main(String[] args) {
        
        Mediador mediador = new MediadorConcreto();
        
        Colaborador c1 = new ColaboradorConcreto(mediador, "Marcelo");
        Colaborador c2 = new ColaboradorConcreto(mediador, "Leticia");
        Colaborador c3 = new ColaboradorConcreto(mediador, "Ana");
        Colaborador c4 = new ColaboradorConcreto(mediador, "Valdemar");
        Colaborador c5 = new ColaboradorConcreto(mediador, "Alcides");
        
        c1.enviarMensagem("Ola a todos");
        c2.enviarMensagem("Bom dia");
        c3.enviarMensagem("Quintou");
        c4.enviarMensagem("Tudo beleza pessoal?");
        c5.enviarMensagem("Tudo certo");
    }
    
}
