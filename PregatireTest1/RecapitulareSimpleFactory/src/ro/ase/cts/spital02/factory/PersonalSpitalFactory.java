package ro.ase.cts.spital02.factory;

import ro.ase.cts.spital02.personal.Angajat;
import ro.ase.cts.spital02.personal.Asistent;
import ro.ase.cts.spital02.personal.Brancardier;
import ro.ase.cts.spital02.personal.Medic;

public class PersonalSpitalFactory {


    public static Angajat getAngajat(String nume,double salariu, TipAngajatSpital tipAngajatSpital) throws Exception {
        switch (tipAngajatSpital) {
            case MEDIC: return new Medic(nume,salariu);
            case ASISTENT: return new Asistent(nume,salariu);
            case BRANCARDIER: return new Brancardier(nume,salariu);
            default: throw new Exception("Tipul de angajat nu exista!");
        }
    }
}
