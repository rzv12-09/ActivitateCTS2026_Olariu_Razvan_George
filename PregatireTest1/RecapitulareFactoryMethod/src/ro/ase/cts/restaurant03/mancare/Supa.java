package ro.ase.cts.restaurant03.mancare;

public abstract class Supa implements FelMancare {
    private double pret;
    private double nrIngrediente;

    public Supa(double pret, double nrIngrediente) {
        this.pret = pret;
        this.nrIngrediente = nrIngrediente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("pret:").append(pret);
        sb.append(", nrIngrediente:").append(nrIngrediente);
        return sb.toString();
    }
}
