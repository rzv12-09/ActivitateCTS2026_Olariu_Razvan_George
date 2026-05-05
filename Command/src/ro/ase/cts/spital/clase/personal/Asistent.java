package ro.ase.cts.spital.clase.personal;

import ro.ase.cts.spital.clase.pacient.Pacient;

public class Asistent implements PersonalSpital{
    private String nume;

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistentul " + this.nume + " trateaza pacientul " + pacient.getNume());
    }

    public Asistent(String nume) {
        this.nume = nume;
    }
}
