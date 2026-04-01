package ro.ase.cts.spital03.factory;

import ro.ase.cts.spital03.classes.AngajatSpital;
import ro.ase.cts.spital03.classes.Registrator;
import ro.ase.cts.spital03.classes.Secretar;
import ro.ase.cts.spital03.enums.TipAngajat;
import ro.ase.cts.spital03.enums.TipAngajatNonMedical;

public class FabricaAngajatNonMedical implements FabricaAngajat {
    @Override
    public AngajatSpital creareAngajat(TipAngajat tipAngajat, String nume, double salariu) {
        return switch (tipAngajat) {
            case TipAngajatNonMedical.REGISTRATOR -> new Registrator(nume,salariu);
            case TipAngajatNonMedical.SECRETAR -> new Secretar(nume,salariu);
            default -> throw  new IllegalArgumentException("Tip invalid");
        };
    }

    @Override
    public AngajatSpital creareAngajat(TipAngajat tipAngajat, String nume, double salariu, String sectie) {
        return creareAngajat(tipAngajat,nume,salariu);
    }
}
