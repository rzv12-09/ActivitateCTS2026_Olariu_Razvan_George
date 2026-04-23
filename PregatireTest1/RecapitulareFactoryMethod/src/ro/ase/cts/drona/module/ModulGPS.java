package ro.ase.cts.drona.module;

public class ModulGPS extends AbstractModule {
    private int nrSateliti;
    private float marjaEroareMetri;

    public ModulGPS(String name, String description, float price) {
        super(name, description, price);
        this.nrSateliti = 4;
        this.marjaEroareMetri = 5.0f;
    }

    public void setNrSateliti(int nrSateliti) {
        this.nrSateliti = nrSateliti;
    }

    public void setMarjaEroareMetri(float marjaEroareMetri) {
        this.marjaEroareMetri = marjaEroareMetri;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("GPS [" + name + "] - " + description + " | Pret: " + price +
                " | Sateliti: " + nrSateliti + " | Eroare: " + marjaEroareMetri + "m");
    }
}
