package ro.ase.cts.multinationala.clase;

public class Angajat implements Structura {
    private String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDescriere(String spatii) {
        System.out.println(spatii + "Angajat:"+this.nume);
    }
}
