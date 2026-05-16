package ro.ase.cts.stb.clase;

public class Usa {
    private TipUsa tipUsa;
    public void seteazaModLiber() {
        System.out.println("Usa " + this.tipUsa + " a fost pusa in modul liber!");
    }
    public void deschideFortat() {
        System.out.println("Usa " + this.tipUsa + " a fost deschisa fortat!");
    }

    public Usa(TipUsa tipUsa) {
        this.tipUsa = tipUsa;
    }
}
