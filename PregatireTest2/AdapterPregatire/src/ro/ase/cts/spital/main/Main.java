package ro.ase.cts.spital.main;

import ro.ase.cts.spital.farmacie.Farmacie;
import ro.ase.cts.spital.farmacie.MedicamentFarmacie;
import ro.ase.cts.spital.spital.MedicamentAdapter;
import ro.ase.cts.spital.spital.MedicamentSpital;

public class Main {
    static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital(true,"Ibuprofen");
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Nurofen");

        MedicamentAdapter medicamentAdapter = new MedicamentAdapter(medicamentSpital);
        Farmacie.vindeMedicament(medicamentFarmacie);
        Farmacie.vindeMedicament(medicamentAdapter);
    }
}
