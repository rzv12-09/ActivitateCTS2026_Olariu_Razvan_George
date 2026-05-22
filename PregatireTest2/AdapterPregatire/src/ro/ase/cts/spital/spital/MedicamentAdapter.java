package ro.ase.cts.spital.spital;

import ro.ase.cts.spital.farmacie.MedicamentFarmacie;

public class MedicamentAdapter extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public MedicamentAdapter(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        this.medicamentSpital.achizitioneazaMedicament();
    }
}
