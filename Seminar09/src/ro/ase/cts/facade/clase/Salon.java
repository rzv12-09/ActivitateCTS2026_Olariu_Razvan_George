package ro.ase.cts.facade.clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Salon {
    private boolean[] paturiDisponibile = new boolean[10];
    public Salon(){
        this.paturiDisponibile[1] = true;
        this.paturiDisponibile[2] = true;
        this.paturiDisponibile[3] = true;
        this.paturiDisponibile[4] = true;
    }

    public int getPatLiber() {
        for (int i = 0; i < 10; i++) {
            if(this.paturiDisponibile[i] == true) {
                return i;
            }
        }
        return -1;
    }
    public void ocupaPat(int nrPat) {
        this.paturiDisponibile[nrPat] = false;
    }
}
