package ro.ase.cts.restaurant.classes;

public abstract class Desert implements FelMancare {
    int calorii;
    double pret;
    double gramaj;

    public Desert(int calorii, double pret, double gramaj) {
        this.calorii = calorii;
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("calorii=").append(calorii);
        sb.append(", pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        return sb.toString();
    }
}
