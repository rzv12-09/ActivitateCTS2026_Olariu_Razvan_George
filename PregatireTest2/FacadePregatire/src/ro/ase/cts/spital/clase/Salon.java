package ro.ase.cts.spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Boolean> disponibilitatePaturi;

    public Salon() {
        this.disponibilitatePaturi = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            this.disponibilitatePaturi.add(false);
        }
    }

    public boolean existaPaturiDisponibile() {
        return this.disponibilitatePaturi.contains(true);
    }

    public void rezervaPad(int index) {
        this.disponibilitatePaturi.set(index,false);
    }
    public void elibereazaPat(int index) {
        this.disponibilitatePaturi.set(index,true);
    }

}
