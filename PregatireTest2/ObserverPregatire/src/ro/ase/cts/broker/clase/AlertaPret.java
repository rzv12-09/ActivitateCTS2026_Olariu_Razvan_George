package ro.ase.cts.broker.clase;

public interface AlertaPret {
    void abonareUtilizator(Utilizator utilizator);
    void dezabonareUtilizator(Utilizator utilizator);
    void notificaUtilizatori(String mesaj);
}
