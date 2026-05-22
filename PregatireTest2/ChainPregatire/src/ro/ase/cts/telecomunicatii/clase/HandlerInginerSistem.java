package ro.ase.cts.telecomunicatii.clase;

public class HandlerInginerSistem extends TichetHandler {


    @Override
    public void proceseazaTichet(TipDificultate tipDificultate, int codTichet) {
        System.out.println("Tichetul " + codTichet + " va fi procesat de un inginer de sistem!");
    }
}
