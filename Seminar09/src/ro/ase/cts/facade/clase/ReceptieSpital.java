package ro.ase.cts.facade.clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public  void interneazaPacient(Pacient pacient) {
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
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu are o gravitate ridicata! ");
        }
    }
}
