package ro.ase.cts.mall.builder02;

import ro.ase.cts.mall.builder02.Magazin;
import ro.ase.cts.mall.builder02.TipPodea;

public class MagazinBuilder implements AbstractBuilder {
    private String denumire;
    private double suprafata;
    private int nrIntrari;
    private TipPodea tipPodea;

    public MagazinBuilder() {
        this.nrIntrari = 1;
        this.tipPodea = TipPodea.STANDARD;
    }

    @Override
    public Magazin build(String denumire,double suprafata) {
        return new Magazin(denumire,suprafata,this.nrIntrari,this.tipPodea);
    }

    @Override
    public AbstractBuilder setTipPodea(TipPodea tipPodea) {
        this.tipPodea = tipPodea;
        return this;
    }

    @Override
    public AbstractBuilder setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
        return this;
    }
}
