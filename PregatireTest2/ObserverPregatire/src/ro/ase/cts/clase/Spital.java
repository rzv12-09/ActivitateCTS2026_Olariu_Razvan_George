package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String denumire;
    private List<Pacient> pacienti;
    public Spital(String denumire) {
        this.denumire = denumire;
        this.pacienti = new ArrayList<>();
    }

    @Override
    public void notificaPacienti(String mesaj) {
        for (Pacient pacient : pacienti) {
            pacient.primesteNotificare(mesaj);
        }
    }

    @Override
    public void abonarePacient(Pacient pacient) {
        this.pacienti.add(pacient);
    }

    @Override
    public void dezabonarePacient(Pacient pacient) {
        this.pacienti.remove(pacient);
    }

    public void notificaVirus() {
        this.notificaPacienti("A fost depistat un nou virus!");
    }

    public void notificaEpidemie() {
        this.notificaPacienti("A fost depistat o noua epidemie!");
    }
}
