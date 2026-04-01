package ro.ase.cts.restaurant02.builder;

import ro.ase.cts.restaurant02.builder02.AbstractBuilder;

public class Rezervare {
    private String numeClient;
    private boolean areScauneErgonomice;
    private boolean staLaGeam;
    private boolean areMuzicaPersonalizata;

    public Rezervare(String numeClient, boolean areScauneErgonomice, boolean staLaGeam, boolean areMuzicaPersonalizata) {
        this.numeClient = numeClient;
        this.areScauneErgonomice = areScauneErgonomice;
        this.staLaGeam = staLaGeam;
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", areScauneErgonomice=").append(areScauneErgonomice);
        sb.append(", staLaGeam=").append(staLaGeam);
        sb.append(", areMuzicaPersonalizata=").append(areMuzicaPersonalizata);
        sb.append('}');
        return sb.toString();
    }


}
