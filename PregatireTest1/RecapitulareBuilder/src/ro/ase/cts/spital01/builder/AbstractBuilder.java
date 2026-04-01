package ro.ase.cts.spital01.builder;

public interface AbstractBuilder {
    Internare build(String numePacient);
    AbstractBuilder setArePatRabatabil(boolean arePatRabatabil);
    AbstractBuilder setAreMicDejun(boolean areMicDejun);
    AbstractBuilder setArePapuci(boolean arePapuci);
    AbstractBuilder setAreHalat(boolean areHalat);
}
