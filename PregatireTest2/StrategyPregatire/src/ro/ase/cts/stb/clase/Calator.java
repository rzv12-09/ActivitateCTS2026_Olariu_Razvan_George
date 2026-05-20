package ro.ase.cts.stb.clase;

public class Calator {
    private String nume;
    private ModPlata modPlata;

    public Calator(String nume, ModPlata modPlata) {
        this.modPlata = modPlata;
        this.nume = nume;
    }

    public Calator(String nume) {
        this.nume = nume;
        this.modPlata = new PlataSMS();
    }

    public void plateste() {
        System.out.println(this.nume + " a efectuat plata!");
        this.modPlata.efectuarePlata();
    }

    public void setModalitatePlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}
