package ro.ase.cts.stb.main;

import ro.ase.cts.stb.clase.Autobuz;
import ro.ase.cts.stb.clase.Operator;
import ro.ase.cts.stb.clase.PlecareTraseu;

public class Main {
    static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz1 = new Autobuz("B 202 STB");
        Autobuz autobuz2 = new Autobuz("B 333 STB");
        operator.adaugaComanda(new PlecareTraseu("121",autobuz1));
        operator.adaugaComanda(new PlecareTraseu("64",autobuz2));
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
