package com.company;

public class Personagem
{
    private String name;

    public Personagem (String name)
    {
     this.setName(name);
    }

    public void dizerOla(Personagem outroPersonagem)
    {
      System.out.println(this.name +":Eai, o que você está fazendo " + outroPersonagem.getName()+"?");

    }
    public void responderOla(Personagem outroPersonagem)
    {
        System.out.println(this.name +":Não enche, estou pulando corda para perder peso,  " + outroPersonagem.getName()+".");
    }

    public void oferecerAjuda(Personagem outroPersonagem)
    {
        System.out.println(this.name +":Você que ajuda pala conta os seus pulos,  " + outroPersonagem.getName()+"?");

    }
    public void aceitarAjuda(Personagem outroPersonagem)
    {
        System.out.println(this.name +":Quero sim " + outroPersonagem.getName()+  ",está difícil contar e pular, estou ficando mais cansada.");
    }

    public void contando(Personagem outroPersonagem)
    {
        System.out.println(this.name +":Ok,vamos lá. Um,Dois,Tlês,Quatlo,Cinco... " +"Vamos "+ outroPersonagem.getName()+" mais lápido.");

    }
    public void respondendoAConta(Personagem outroPersonagem)
    {
        System.out.println(this.name +":Você não me irrite viu " + outroPersonagem.getName()+ "!!!!!!");
    }

    public void dizerOi(Personagem outroPersonagem)
    {
        System.out.println(this.name +":Oi, o que vocês estão fazendo, " + outroPersonagem.getName() + "?");

    }
    public void respondendoOi(Personagem outroPersonagem)
    {
        System.out.println(this.name +":Oi "  + outroPersonagem.getName() + ", a Mônica está pulando colda e eu estou ajudando ela a conta, mas ela está tão golda que vai demola um século pala eu pala !!!");
    }

    public void correndoAtras(Personagem outroPersonagem)
    {
        System.out.println(this.name +":Vem aqui "+ outroPersonagem.getName()+"  seu atrevido,deixa eu te mostrar a gorda...  " );

    }
    public void correndoDeVolta(Personagem outroPersonagem)
    {
        System.out.println(this.name +":Sai daqui, "+ outroPersonagem.getName() + " sua golducha, baliguda, pale de cole atlas de mim" + "!!!");
    }

    public void falandoSozinha(Personagem outroPersonagem)
    {
        System.out.println(this.name +":Tudo bem então, vou voltar a comer minha melância, TCHAU PARA VOCÊS. AH, BOA SORTE " + outroPersonagem.getName() + "!!!");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
