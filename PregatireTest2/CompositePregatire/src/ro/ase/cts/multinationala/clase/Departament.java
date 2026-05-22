package ro.ase.cts.multinationala.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String nume;
    private List<Structura> echipe;

    public Departament(String nume) {
        this.nume = nume;
        this.echipe = new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere(String spatii) {
        System.out.println(spatii + "Departament:" + this.nume);
        System.out.println(spatii + "SubStructuri:");
        for (Structura structura : this.echipe) {
            structura.afiseazaDescriere(spatii + "   ");
        }
    }

    public void adaugaNod(Structura structura){
        this.echipe.add(structura);
    }

}
