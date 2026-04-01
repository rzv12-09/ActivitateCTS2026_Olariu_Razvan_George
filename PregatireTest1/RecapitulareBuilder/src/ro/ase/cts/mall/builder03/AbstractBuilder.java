package ro.ase.cts.mall.builder03;

public interface AbstractBuilder {
    Magazin build();
    AbstractBuilder setTipPodea(TipPodea tipPodea);
    AbstractBuilder setNrIntrari(int nrIntrari);
}
