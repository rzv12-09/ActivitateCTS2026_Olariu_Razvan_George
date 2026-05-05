package ro.ase.cts.spital.clase.command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;
    public void inregistreaza(Command command) {
        this.comenzi.add(command);
    }

    public void executaFisa() {
       if(this.comenzi.size() == 0) {
           return;
       }
       this.comenzi.removeFirst().executa();
    }

    public Operator() {
        this.comenzi = new ArrayList<>();
    }
}
