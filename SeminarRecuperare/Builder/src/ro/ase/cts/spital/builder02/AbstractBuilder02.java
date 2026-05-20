package ro.ase.cts.spital.builder02;

public interface AbstractBuilder02 {
    Internare build(String nume);
    AbstractBuilder02 setArePatRabatabil(boolean arePatRabatabil);
    AbstractBuilder02 setAreMicDejunInclus(boolean areMicDejunInclus);
    AbstractBuilder02 setArePapuciCamera(boolean arePapuciCamera);
    AbstractBuilder02 setAreHalat(boolean areHalat);
}
