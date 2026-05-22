package ro.ase.cts.telecomunicatii.clase;

public class HandlerOperatorUman extends TichetHandler {

    @Override
    public void proceseazaTichet(TipDificultate tipDificultate, int codTichet) {
        if (tipDificultate == TipDificultate.MEDIE) {
            System.out.println("Tichetul " + codTichet + " va fi procesat de un operator uman!");
            return;
        }
        super.succesor.proceseazaTichet(tipDificultate,codTichet);
    }
}
