package ro.ase.cts.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Structura {
    private String nume;
    private List<Structura> subStructuri;

    public Sectiune(String nume) {
        this.nume = nume;
        this.subStructuri = new ArrayList<>();
    }

    @Override
    public void afiseazaNume(String spatii) {
        System.out.println(spatii + "L___" + this.nume);
        for (Structura structura : this.subStructuri) {
            structura.afiseazaNume(spatii + "     ");
        }
    }

    public void adaugaStructura(Structura structura) {
        this.subStructuri.add(structura);
    }

    public void stergeStructura(Structura structura) {
        this.subStructuri.remove(structura);
    }

    public Structura getStructura(int index) {
        return this.subStructuri.get(index);
    }
}
