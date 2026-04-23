package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Medic;
import ro.ase.cts.facade.clase.Pacient;
import ro.ase.cts.facade.clase.ReceptieSpital;
import ro.ase.cts.facade.clase.Salon;

public class Main {
    static void main(String[] args) {
        Pacient pacient = new Pacient("Razvan",7);
        Medic medic = new Medic();
        Salon salon = new Salon();
        if(pacient.getGravitate() > 6) {
            if(medic.areInregistratPacientul(pacient)) {
                int nrPat = salon.getPatLiber();
                if (nrPat != -1) {
                    System.out.println("Pacientul " + pacient.getNume() + " este internat in spital in patul " + nrPat);
                    salon.ocupaPat(nrPat);
                } else {
                    System.out.println("Nu s-au gasit paturi libere!");
                }
            } else {
                System.out.println("Pacientul nu are inregistrare!");
            }
        }
        Pacient pacient1= new Pacient("Niko",9);
        Pacient pacient2= new Pacient("Tudor",9);
        Pacient pacient3= new Pacient("Flavia",9);
        ReceptieSpital spital = new ReceptieSpital(medic,salon);
        spital.interneazaPacient(pacient1);
        spital.interneazaPacient(pacient2);
        spital.interneazaPacient(pacient3);
    }


}
