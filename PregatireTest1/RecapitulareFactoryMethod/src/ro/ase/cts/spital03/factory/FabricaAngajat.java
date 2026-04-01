package ro.ase.cts.spital03.factory;

import ro.ase.cts.spital03.classes.AngajatSpital;
import ro.ase.cts.spital03.enums.TipAngajat;

public interface FabricaAngajat {
    AngajatSpital creareAngajat(TipAngajat tipAngajat, String nume, double salariu);
    AngajatSpital creareAngajat(TipAngajat tipAngajat, String nume, double salariu, String sectie);
}
