package ro.ase.cts.adapter.main;

import ro.ase.cts.adapter.farmacie.Medicament;
import ro.ase.cts.adapter.spital.MedicamentAdapter;

public class Main {
    private static void procuraMedicament(Medicament medicament) {

    }

    static void main(String[] args) {
        Medicament medicamentFarmacie = new Medicament("nurofen",30.2);
        ro.ase.cts.adapter.spital.Medicament medicamentSpital = new ro.ase.cts.adapter.spital.Medicament("algocamin-reteta",40.7);
        medicamentFarmacie.cumparaMedicament();
        medicamentSpital.achizitioneazaMedicament();
        procuraMedicament(medicamentFarmacie);
        MedicamentAdapter medicamentAdapter = new MedicamentAdapter(medicamentSpital);
        procuraMedicament(medicamentAdapter);
    }
}
