package ro.ase.cts.restaurant02.builder02;

public class Rezervare {
    private String numeClient;
    private boolean areScauneErgonomice;
    private boolean staLaGeam;
    private boolean areMuzicaPersonalizata;

    private Rezervare(RezervareBuilder2 builder) {
        this.numeClient = builder.numeClient;
        this.areScauneErgonomice = builder.areScauneErgonomice;
        this.staLaGeam = builder.staLaGeam;
        this.areMuzicaPersonalizata = builder.areMuzicaPersonalizata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", areScauneErgonomice=").append(areScauneErgonomice);
        sb.append(", staLaGeam=").append(staLaGeam);
        sb.append(", areMuzicaPersonalizata=").append(areMuzicaPersonalizata);
        sb.append('}');
        return sb.toString();
    }

    public static RezervareBuilder2 builder(String numeClient) {
        return new RezervareBuilder2(numeClient);
    }

    public static class RezervareBuilder2 implements AbstractBuilder {

        private String numeClient;
        private boolean areScauneErgonomice;
        private boolean staLaGeam;
        private boolean areMuzicaPersonalizata;

        private RezervareBuilder2(String numeClient) {
            this.numeClient = numeClient;
            this.areScauneErgonomice = false;
            this.staLaGeam = false;
            this.areMuzicaPersonalizata = false;
        }


        @Override
        public ro.ase.cts.restaurant02.builder02.Rezervare build() {
            return new Rezervare(this);
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
}
