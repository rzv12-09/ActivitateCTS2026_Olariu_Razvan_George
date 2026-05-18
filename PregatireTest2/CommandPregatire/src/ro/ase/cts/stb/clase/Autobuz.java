package ro.ase.cts.stb.clase;

public class Autobuz {
    private String nrInmatriculare;

    public void pleacaPeTraseu(String linie) {
        System.out.println("Autobuzul " + this.nrInmatriculare + " a plecat pe linia " + linie);
    }

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }
}
