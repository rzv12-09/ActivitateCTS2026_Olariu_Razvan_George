package ro.ase.cts.broker.clase;

import java.util.ArrayList;
import java.util.List;

public class AlertaPretTesla implements AlertaPret {
    private List<Utilizator> utilizatori;

    public AlertaPretTesla() {
        this.utilizatori = new ArrayList<>();
    }

    @Override
    public void abonareUtilizator(Utilizator utilizator) {
        this.utilizatori.add(utilizator);
    }

    @Override
    public void dezabonareUtilizator(Utilizator utilizator) {
        this.utilizatori.remove(utilizator);
    }

    @Override
    public void notificaUtilizatori(String mesaj) {
        for (Utilizator utilizator : this.utilizatori) {
            utilizator.notificare(mesaj);
        }
    }

    public void cresterePret() {
        this.notificaUtilizatori("Pretul actiunii Tesla a crescut cu 10%!");
    }
    public void scaderePret() {
        this.notificaUtilizatori("Pretul actiunii Tesla a scazut cu 10%!");
    }
}
