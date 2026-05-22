package ro.ase.cts.telecomunicatii.clase;

public class HandlerChatbot extends TichetHandler {

    @Override
    public void proceseazaTichet(TipDificultate tipDificultate, int codTichet) {
        if (tipDificultate == TipDificultate.SCAZUTA) {
            System.out.println("Tichetul " + codTichet + " va fi procesat de un chatbot!");
            return;
        }
        super.succesor.proceseazaTichet(tipDificultate,codTichet);
    }
}
