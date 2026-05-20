package ro.ase.cts.foto.clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorPreset {
    private List<Comanda> comenzi;

    public OperatorPreset() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Comanda comanda) {
        this.comenzi.add(comanda);
    }

    public void invocaComanda() {
        if(this.comenzi.size() == 0) {
            System.out.println("Nu mai sunt preseturi de aplicat in coada!");
            return;
        }
        this.comenzi.remove(0).executa();
    }
}
