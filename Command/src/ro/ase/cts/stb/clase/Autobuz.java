package ro.ase.cts.stb.clase;

public class Autobuz {
    private String nrInmatriculare;

    public void pornestePeTraseu(String linie) {
        System.out.println("Autobuzul " + this.nrInmatriculare + " porneste pe traseul " + linie);
    }

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }
}
