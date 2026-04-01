package ro.ase.cts.restaurant02.builder;

public class RezervareBuilder implements AbstractBuilder {
    private boolean areScauneErgonomice;
    private boolean staLaGeam;
    private boolean areMuzicaPersonalizata;

    public RezervareBuilder() {
        this.areScauneErgonomice = false;
        this.staLaGeam = false;
        this.areMuzicaPersonalizata = false;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient,areScauneErgonomice,staLaGeam,areMuzicaPersonalizata);
    }

    @Override
    public AbstractBuilder setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
        return this;
    }

    @Override
    public AbstractBuilder setStaLaGeam(boolean staLaGeam) {
        this.staLaGeam = staLaGeam;
        return this;
    }

    @Override
    public AbstractBuilder setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
        return this;
    }

}
