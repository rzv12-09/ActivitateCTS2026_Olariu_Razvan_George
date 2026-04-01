package ro.ase.cts.restaurant01.supe;

public class SupaLegume extends Supa {
    private double pret;

    public SupaLegume(double gramaj, double calorii, double pret) {
        super(gramaj, calorii);
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa de legume: ");
        sb.append(super.toString());
        sb.append(", pret:").append(pret);
        return sb.toString();
    }
}
