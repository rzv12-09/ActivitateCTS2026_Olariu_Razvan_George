package ro.ase.cts.stb.clase;

public class BordAutobuz {
    private Usa usaFata = new Usa(TipUsa.FATA);
    private Usa usaMijloc = new Usa(TipUsa.MIJLOC);
    private Usa usaSpate = new Usa(TipUsa.SPATE);

    public void seteazaToateUsileModLiber() {
        this.usaFata.seteazaModLiber();
        this.usaMijloc.seteazaModLiber();
        this.usaSpate.seteazaModLiber();
    }

    public void deschideFortatToateUsile() {
        this.usaFata.deschideFortat();
        this.usaMijloc.deschideFortat();
        this.usaSpate.deschideFortat();
    }
}
