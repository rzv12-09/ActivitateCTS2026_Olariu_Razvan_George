package ro.ase.cts.spital.builder01;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNumePacient(String numePacient);
    AbstractBuilder setArePatRabatabil(boolean arePatRabatabil);
    AbstractBuilder setAreMicDejunInclus(boolean areMicDejunInclus);
    AbstractBuilder setArePapuciCamera(boolean arePapuciCamera);
    AbstractBuilder setAreHalat(boolean areHalat);
}
