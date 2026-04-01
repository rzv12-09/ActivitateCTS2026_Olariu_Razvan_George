package ro.ase.cts.spital01.builder;

public class InternareBuilder implements AbstractBuilder {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;

    public InternareBuilder() {
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.arePapuci = false;
        this.areHalat = false;
    }

    @Override
    public Internare build(String numePacient) {
        return new Internare(numePacient,arePatRabatabil,areMicDejun,arePapuci,areHalat);
    }


    @Override
    public AbstractBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return  this;
    }

    @Override
    public AbstractBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }
}
