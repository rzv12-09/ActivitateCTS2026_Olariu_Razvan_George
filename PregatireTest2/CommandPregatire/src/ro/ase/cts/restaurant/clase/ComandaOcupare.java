package ro.ase.cts.restaurant.clase;

public class ComandaOcupare implements Command {
    private Masa masa;

    public ComandaOcupare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        this.masa.ocupaMasa();
    }
}
