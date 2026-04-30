package ro.ase.cts.proxy.clase;

public class Autobuz implements MijlocTransport{
    private String linie;
    private int nrCalatori;


    @Override
    public void oprireStatie() {
        System.out.println("Autobuzul de pe linia " + this.linie + " s-a oprit in statie!");
    }

    public String getLinie() {
        return linie;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public Autobuz(String linie, int nrCalatori) {
        this.linie = linie;
        this.nrCalatori = nrCalatori;
    }
}
