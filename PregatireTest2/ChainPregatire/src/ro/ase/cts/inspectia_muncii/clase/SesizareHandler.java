package ro.ase.cts.inspectia_muncii.clase;

public abstract class SesizareHandler {
    protected SesizareHandler succesor;

    public SesizareHandler() {
        this.succesor = null;
    }

    public void setSuccesor(SesizareHandler succesor) {
        this.succesor = succesor;
    }

    public abstract void proceseazaSesizare(int nrAngajatiAfectati);
}
