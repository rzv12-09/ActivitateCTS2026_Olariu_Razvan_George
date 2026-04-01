package ro.ase.cts.spital03.factory;

import ro.ase.cts.spital03.classes.AngajatSpital;
import ro.ase.cts.spital03.classes.Asistent;
import ro.ase.cts.spital03.classes.Brancardier;
import ro.ase.cts.spital03.classes.Medic;
import ro.ase.cts.spital03.enums.TipAngajat;
import ro.ase.cts.spital03.enums.TipAngajatMedical;

public class FabricaAngajatMedical implements FabricaAngajat {

    @Override
    public AngajatSpital creareAngajat(TipAngajat tipAngajat, String nume, double salariu) {
      return this.creareAngajat(tipAngajat,nume,salariu,"CARDIOLOGIE");
    }

    @Override
    public AngajatSpital creareAngajat(TipAngajat tipAngajat, String nume, double salariu, String sectie) {
        switch (tipAngajat) {
            case TipAngajatMedical.MEDIC: return new Medic(nume,salariu,sectie);
            case TipAngajatMedical.ASISTENT: return new Asistent(nume,salariu,sectie);
            case TipAngajatMedical.BRANCARDIER: return  new Brancardier(nume,salariu,sectie);
            default: throw new IllegalArgumentException("Tip invalid");
        }
    }
}
