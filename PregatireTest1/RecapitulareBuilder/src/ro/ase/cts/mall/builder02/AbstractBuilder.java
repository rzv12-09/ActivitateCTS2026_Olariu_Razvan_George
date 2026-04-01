package ro.ase.cts.mall.builder02;

import ro.ase.cts.mall.builder02.Magazin;

public interface AbstractBuilder {
    Magazin build(String denumire, double suprafata);
    AbstractBuilder setTipPodea(TipPodea tipPodea);
    AbstractBuilder setNrIntrari(int nrIntrari);
}
