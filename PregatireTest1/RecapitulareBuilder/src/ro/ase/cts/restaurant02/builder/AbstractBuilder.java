package ro.ase.cts.restaurant02.builder;

public interface AbstractBuilder {
    Rezervare build(String nume);
    AbstractBuilder setAreScauneErgonomice(boolean areScauneErgonomice);
    AbstractBuilder setStaLaGeam(boolean staLaGeam);
    AbstractBuilder setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata);
}
