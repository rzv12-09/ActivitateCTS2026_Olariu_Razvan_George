package ro.ase.cts.restaurant01.supe;

public class SupaVita extends Supa {
    public SupaVita(double gramaj, double calorii) {
        super(gramaj, calorii);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa de vita: ");
        sb.append(super.toString());
        return sb.toString();
    }
}
