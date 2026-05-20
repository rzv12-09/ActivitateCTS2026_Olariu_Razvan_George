package ro.ase.cts.spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String denumire;
    private List<Structura> subStructuri;

    public Departament(String denumire) {
        this.denumire = denumire;
        this.subStructuri = new ArrayList<>();
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Departament: " +  this.denumire);
        System.out.println(spatii + "Subdepartamente");
        for (Structura structura : this.subStructuri) {
            structura.afiseazaDetaliiStructura(spatii + "     ");
        }
    }

    public void adaugaNod(Structura structura) {
        this.subStructuri.add(structura);
    }
    public void stergeNod(Structura structura) {
        this.subStructuri.remove(structura);
    }

    public Structura getStructura(int index) {
        return this.subStructuri.get(index);
    }
}
