package ro.ase.cts.spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String nume;
    private List<Pacient> pacienti;

    public Spital(String nume) {
        this.nume = nume;
        this.pacienti = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Pacient pacient : this.pacienti) {
           pacient.receptioneazaMesaj(mesaj);
        }
    }

        @Override
    public void aboneazaPacient(Pacient pacient) {
        this.pacienti.add(pacient);
    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        this.pacienti.remove(pacient);
    }

    public void notificaVirus(){
        this.trimiteMesaj("A fost depistat un virus!");
    }
    public void notificaPandemie(){
        this.trimiteMesaj("A fost depistata o pandemie!");
    }
}
