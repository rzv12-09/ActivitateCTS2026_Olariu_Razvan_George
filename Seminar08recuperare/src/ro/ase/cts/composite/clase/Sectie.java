package ro.ase.cts.composite.clase;

public class Sectie implements Structura {
    public String numeSectie;
    public int nrAngajati;

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Nume sectie: " + this.numeSectie + " Nr Angajati:" + this.nrAngajati);
    }

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }
}
