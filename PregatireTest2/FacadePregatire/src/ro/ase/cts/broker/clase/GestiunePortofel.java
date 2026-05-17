package ro.ase.cts.broker.clase;

public class GestiunePortofel {
    public boolean areFonduriSuficiente(Client client,double sumaTranzactie) {
        return client.getSold() >= sumaTranzactie;
    }
}
