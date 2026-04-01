package ro.ase.cts.restaurant03.mancare;

public abstract class Desert implements FelMancare {
    private double calorii;

    public Desert(double calorii) {
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("calorii:").append(calorii);
        return sb.toString();
    }
}
