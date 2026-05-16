package ro.ase.cts.spital.clase;

public class Facade {
    public static void interneazaPacient(Pacient pacient) {
        Medic medic = new Medic("razvan");
        Salon salon= new Salon();
        if(medic.poateFiInternat(pacient)) {
            if (salon.existaPaturiDisponibile()) {
                salon.rezervaPad(0);
                System.out.println("pacientul a fost internat");
            } else {
                System.out.println("Nu exista paturi disponibile");
            }
        } else {
            System.out.println("Gravitatea pacientului nu este destul de mare!");
        }
    }
}
