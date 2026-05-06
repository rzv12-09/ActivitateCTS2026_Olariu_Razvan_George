package ro.ase.cts.stb.clase;

public class Plecare implements Command {
    private String linie;
    private Autobuz autobuz;

    @Override
    public void pleacaInCursa() {
        this.autobuz.pornestePeTraseu(this.linie);
    }

    public Plecare(String linie, Autobuz autobuz) {
        this.linie = linie;
        this.autobuz = autobuz;
    }
}
