package ro.ase.cts.restaurant02.builder02;

public interface AbstractBuilder {
    Rezervare build();
    AbstractBuilder setAreScauneErgonomice(boolean areScauneErgonomice);
    AbstractBuilder setStaLaGeam(boolean staLaGeam);
    AbstractBuilder setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata);
}
