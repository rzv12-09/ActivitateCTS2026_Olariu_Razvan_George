package ro.ase.cts.restaurant.clase;

import java.util.List;

public class ReceptieFacade {
    private PersonalServire personalServire;
    private PersonalServetele personalServetele;

    public ReceptieFacade(){
        this.personalServetele = new PersonalServetele();
        this.personalServire = new PersonalServire();
    }

    public void rezervaMasa(Restaurant restaurant) {
        List<Masa> mese = restaurant.getMese();
        for (Masa masa : mese) {
            if(masa.isEsteDisponibila() && this.personalServire.esteMasaDebarasata(masa) && this.personalServetele.areMasaServetele(masa)) {
                restaurant.rezervaMasa(masa);
                System.out.println("Masa " + masa.getId() + " a fost rezervata!");
                return;
            }
        }
        System.out.println("Nu s-au gasit mese disponibile pentru rezervare!");
    }
}
