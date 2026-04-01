package ro.ase.cts.spital02.main;

import ro.ase.cts.spital02.factory.PersonalSpitalFactory;
import ro.ase.cts.spital02.factory.TipAngajatSpital;
import ro.ase.cts.spital02.personal.Angajat;
import ro.ase.cts.spital02.personal.Medic;

public class Main {
    static void main(String[] args) throws Exception {
        Angajat medic = PersonalSpitalFactory.getAngajat("Razvan",5000, TipAngajatSpital.MEDIC);
        medic.incepeProgramMunca();
        Angajat asistent = PersonalSpitalFactory.getAngajat("Razvan",5000, TipAngajatSpital.ASISTENT);
        asistent.incepeProgramMunca();
    }
}
