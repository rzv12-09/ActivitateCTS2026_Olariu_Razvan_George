package ro.ase.cts.multinationala.clase;

import java.util.ArrayList;
import java.util.List;

public class Echipa implements Structura {
    private int codEchipa;
    private List<Structura> angajati;

    public Echipa( int codEchipa) {
        this.angajati = new ArrayList<>();
        this.codEchipa = codEchipa;
    }

    @Override
    public void afiseazaDescriere(String spatii) {
        System.out.println(spatii + "Echipa" + this.codEchipa + ":");
        System.out.println(spatii + "Angajati:");
        for (Structura structura : this.angajati) {
            structura.afiseazaDescriere(spatii + "   ");
        }
    }

    public void adaugaNod(Structura structura){
        this.angajati.add(structura);
    }
}
