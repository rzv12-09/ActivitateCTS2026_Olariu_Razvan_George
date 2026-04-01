package ro.ase.cts.restaurant02.builder02;

public interface AbstractBuilder {
    Rezervare build();
    ro.ase.cts.restaurant02.builder02.AbstractBuilder setAreScauneErgonomice(boolean areScauneErgonomice);
    ro.ase.cts.restaurant02.builder02.AbstractBuilder setStaLaGeam(boolean staLaGeam);
    ro.ase.cts.restaurant02.builder02.AbstractBuilder setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata);
}
