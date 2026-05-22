package ro.ase.cts.telecomunicatii.clase;

public abstract class TichetHandler {
    protected TichetHandler succesor;

    public TichetHandler() {
        this.succesor = null;
    }

    public void setSuccesor(TichetHandler succesor) {
        this.succesor = succesor;
    }

    public abstract void proceseazaTichet(TipDificultate tipDificultate, int codTichet);
}
