package ro.ase.cts.restaurant.clase;

public class Masa {
    private int id;
    private boolean areServetele;
    private boolean esteDisponibila;
    private boolean esteDebarasata;

    public Masa(int id, boolean areServetele, boolean esteDisponibila, boolean esteDebarasata) {
        this.id = id;
        this.areServetele = areServetele;
        this.esteDisponibila = esteDisponibila;
        this.esteDebarasata = esteDebarasata;
    }

    public boolean isEsteDisponibila() {
        return esteDisponibila;
    }

    public int getId() {
        return id;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }

    public boolean isAreServetele() {
        return areServetele;
    }

    public void setAreServetele(boolean areServetele) {
        this.areServetele = areServetele;
    }

    public void setEsteDisponibila(boolean esteDisponibila) {
        this.esteDisponibila = esteDisponibila;
    }

    public void setEsteDebarasata(boolean esteDebarasata) {
        this.esteDebarasata = esteDebarasata;
    }
}
