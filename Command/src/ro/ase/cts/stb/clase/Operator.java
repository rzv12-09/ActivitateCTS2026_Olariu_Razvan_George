package ro.ase.cts.stb.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Command command) {
        this.comenzi.add(command);
    }

    public void executaComanda() {
        if(this.comenzi.size() == 0 ) {
            System.out.println("Nu mai sunt comenzi de executat!");
            return;
        }
        this.comenzi.removeFirst().pleacaInCursa();
    }
}
