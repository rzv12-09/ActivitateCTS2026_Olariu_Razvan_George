package ro.ase.cts.spital.builder01;

public class InternareBuilder implements AbstractBuilder {
    private Internare internare;
    public InternareBuilder(String nume) {
        this.internare = new Internare(nume,false,false,false,false);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNumePacient(String numePacient) {
        this.internare.setNumePacient(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.internare.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.internare.setAreMicDejunInclus(areMicDejunInclus);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuciCamera(boolean arePapuciCamera) {
        this.internare.setArePapuciCamera(arePapuciCamera);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean areHalat) {
        this.internare.setAreHalat(areHalat);
        return this;
    }
}
