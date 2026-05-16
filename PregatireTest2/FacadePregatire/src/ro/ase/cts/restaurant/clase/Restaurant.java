package ro.ase.cts.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String denumire;
    private List<Masa> mese;

    public Restaurant(String denumire) {
        this.denumire = denumire;
        this.mese = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            this.mese.add(new Masa(i,false,true,true));
        }
        for (int i = 4; i < 8 ; i++) {
            this.mese.add(new Masa(i,true,false,true));
        }
        for (int i = 8; i < 11 ; i++) {
            this.mese.add(new Masa(i,true,true,true));
        }
    }

    public List<Masa> getMese() {
        return mese;
    }

    public  void rezervaMasa(Masa masa) {
        masa.setAreServetele(false);
        masa.setEsteDebarasata(false);
        masa.setEsteDisponibila(false);
    }
}
