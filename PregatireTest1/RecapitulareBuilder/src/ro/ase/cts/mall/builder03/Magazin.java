package ro.ase.cts.mall.builder03;

public class Magazin {
    private final String denumire;
    private final double suprafata;
    private final int nrIntrari;
    private final TipPodea tipPodea;

    private Magazin(MagazinBuilder builder) {
        this.denumire = builder.denumire;
        this.suprafata = builder.suprafata;
        this.nrIntrari = builder.nrIntrari;
        this.tipPodea = builder.tipPodea;
    }

    public static MagazinBuilder builder(String denumire,double suprafata) {
        return new MagazinBuilder(denumire, suprafata);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrIntrari=").append(nrIntrari);
        sb.append(", tipPodea=").append(tipPodea);
        sb.append('}');
        return sb.toString();
    }

    public static class MagazinBuilder implements AbstractBuilder {
        private String denumire;
        private double suprafata;
        private int nrIntrari;
        private TipPodea tipPodea;

        private MagazinBuilder(String denumire,double suprafata) {
            this.denumire = denumire;
            this.suprafata = suprafata;
            this.nrIntrari = 1;
            this.tipPodea = TipPodea.STANDARD;
        }


        @Override
        public AbstractBuilder setTipPodea(TipPodea tipPodea) {
            this.tipPodea = tipPodea;
            return this;
        }

        @Override
        public AbstractBuilder setNrIntrari(int nrIntrari) {
            this.nrIntrari = nrIntrari;
            return this;
        }

        @Override
        public Magazin build() {
            if(this.nrIntrari < Math.ceil(this.suprafata / 100.0)) {
                throw new ParametruInvalid("nu pot exista mai puțin de 1 intrări per 100 mp de magazin");
            }
            return new Magazin(this);
        }


    }

}
