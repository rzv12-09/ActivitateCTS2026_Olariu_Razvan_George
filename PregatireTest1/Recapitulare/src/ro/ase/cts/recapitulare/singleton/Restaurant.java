package ro.ase.cts.recapitulare.singleton;

public class Restaurant {
    private String denumire;
    private int nrMeseTotale;
    private int nrMeseDisponibile;
    private int nrAngajati;
    private static Restaurant instanta = null;

    private Restaurant() {
    }

    private Restaurant(String denumire, int nrMeseTotale, int nrAngajati) {
        this.denumire = denumire;
        this.nrMeseTotale = nrMeseTotale;
        this.nrAngajati = nrAngajati;
        this.nrMeseDisponibile = nrMeseTotale;
    }

    public void rezervaMasa() {
        if (this.nrMeseDisponibile > 0) {
            System.out.println("Masa a fost rezervata!");
            this.nrMeseDisponibile--;
        } else {
            System.out.println("Nu exista mese disponibile!");
        }
    }

    public static synchronized Restaurant getInstanta(String denumire, int nrMeseTotale, int nrAngajati) {
        if(instanta == null) {
            Restaurant.instanta =  new Restaurant(denumire,nrMeseTotale,nrAngajati);
        }
        return Restaurant.instanta;
    }
}
