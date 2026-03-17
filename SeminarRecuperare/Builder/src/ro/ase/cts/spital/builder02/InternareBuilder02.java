package ro.ase.cts.spital.builder02;

import ro.ase.cts.spital.builder01.AbstractBuilder;

public class InternareBuilder02 implements AbstractBuilder02 {
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalat;

    public InternareBuilder02() {
        this.arePatRabatabil = false;
        this.areMicDejunInclus = false;
        this.arePapuciCamera = false;
        this.areHalat = false;
    }

    @Override
    public Internare build(String nume) {
      return new Internare(nume,arePatRabatabil,areMicDejunInclus,arePapuciCamera,areHalat);
    }


    @Override
    public AbstractBuilder02 setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
        return  this;
    }

    @Override
    public AbstractBuilder02 setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }
}
