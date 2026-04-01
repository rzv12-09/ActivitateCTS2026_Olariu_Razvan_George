package ro.ase.cts.restaurant01.supe;

public abstract class Supa {
    private double gramaj;
    private double calorii;

    public Supa(double gramaj, double calorii) {
        this.gramaj = gramaj;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("gramaj:").append(gramaj);
        sb.append(", calorii:").append(calorii);
        return sb.toString();
    }
}
