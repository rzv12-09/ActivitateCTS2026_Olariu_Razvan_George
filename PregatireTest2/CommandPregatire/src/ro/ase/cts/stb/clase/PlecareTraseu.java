package ro.ase.cts.stb.clase;

public class PlecareTraseu implements Comanda {
    private String linie;
    private Autobuz autobuz;

    public PlecareTraseu(String linie, Autobuz autobuz) {
        this.linie = linie;
        this.autobuz = autobuz;
    }

    @Override
    public void pleacaInCursa() {
        this.autobuz.pleacaPeTraseu(linie);
    }
}
