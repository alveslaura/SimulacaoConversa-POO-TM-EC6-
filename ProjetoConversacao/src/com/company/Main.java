package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
    Personagem cebolinha = new Personagem("Cebolinha");
    Personagem monica = new Personagem("Mônica");
    Personagem magali = new Personagem("Magali");
    cebolinha.dizerOla(monica);
    monica.responderOla(cebolinha);
    cebolinha.oferecerAjuda(monica);
    monica.aceitarAjuda(cebolinha);
    cebolinha.contando(monica);
    monica.respondendoAConta(cebolinha);
    magali.dizerOi(cebolinha);
    cebolinha.respondendoOi(magali);
    monica.correndoAtras(cebolinha);
    cebolinha.correndoDeVolta(monica);
    magali.falandoSozinha(cebolinha);
    }
}
