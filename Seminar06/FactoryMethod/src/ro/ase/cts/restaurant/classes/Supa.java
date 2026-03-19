package ro.ase.cts.restaurant.classes;

public abstract class Supa implements FelMancare{
    double pret;
    double gramaj;

    public Supa(double pret, double gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Pret:").append(pret);
        sb.append(", Gramaj:").append(gramaj);
        return sb.toString();
    }
}
