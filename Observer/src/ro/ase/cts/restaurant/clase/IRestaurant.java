package ro.ase.cts.restaurant.clase;

public interface IRestaurant {
    void notificaClienti(String mesaj);
    void abonareClient(Client client);
    void dezabonareClient(Client client);
}
