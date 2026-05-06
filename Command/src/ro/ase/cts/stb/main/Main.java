package ro.ase.cts.stb.main;

import ro.ase.cts.stb.clase.Autobuz;
import ro.ase.cts.stb.clase.Command;
import ro.ase.cts.stb.clase.Operator;
import ro.ase.cts.stb.clase.Plecare;

public class Main {
    static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz1 = new Autobuz("B 111 STB");
        Autobuz autobuz2 = new Autobuz("B 021 STB");
        Autobuz autobuz3 = new Autobuz("B 923 STB");

        operator.adaugaComanda(new Plecare("N102",autobuz1));
        operator.adaugaComanda(new Plecare("107",autobuz2));
        operator.adaugaComanda(new Plecare("121",autobuz3));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
