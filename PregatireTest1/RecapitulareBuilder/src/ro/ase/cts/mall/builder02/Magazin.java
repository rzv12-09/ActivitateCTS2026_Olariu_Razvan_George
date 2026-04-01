package ro.ase.cts.mall.builder02;

import ro.ase.cts.mall.builder02.TipPodea;

public class Magazin {
    private final String denumire;
    private final double suprafata;
    private final int nrIntrari;
    private final TipPodea tipPodea;

    public Magazin(String denumire, double suprafata, int nrIntrari, TipPodea tipPodea) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.tipPodea = tipPodea;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrIntrari=").append(nrIntrari);
        sb.append(", tipPodea=").append(tipPodea);
        sb.append('}');
        return sb.toString();
    }
}
