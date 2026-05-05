package ro.ase.cts.spital.clase.personal;

import ro.ase.cts.spital.clase.pacient.Pacient;

public class Medic implements PersonalSpital {
    private String nume;


    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Medicul " + this.nume + " interneaza pacientul " + pacient.getNume());
    }

    public Medic(String nume) {
        this.nume = nume;
    }
}
