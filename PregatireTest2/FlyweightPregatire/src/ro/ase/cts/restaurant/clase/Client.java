package ro.ase.cts.restaurant.clase;

public class Client implements IClient {
    private String nume;
    private String telefon;
    private String email;

    public Client(String email, String nume, String telefon) {
        this.email = email;
        this.nume = nume;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("email='").append(email).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaDetaliiRezervareClient(Rezervare rezervare) {
        System.out.println("Detalii client: " + this.toString());
        System.out.println("Detalii rezervare: " + rezervare.toString());
    }
}
