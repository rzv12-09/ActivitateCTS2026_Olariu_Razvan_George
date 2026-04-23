package ro.ase.cts.adapter.spital;

import ro.ase.cts.adapter.farmacie.Medicament;

//facem adapter de obiecte pentru ca avem 2 clase concrete
//extindem obiectul tinta si la atribute avem nevoie de obiectul deja existent
public class MedicamentAdapter extends Medicament {
    public MedicamentAdapter(String nume, double pret) {
        super(nume, pret);
    }
    private ro.ase.cts.adapter.spital.Medicament medicamentSpital;
    public MedicamentAdapter(ro.ase.cts.adapter.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
       medicamentSpital.achizitioneazaMedicament();
    }
}
