package ro.ase.cts.restaurant.clase;

public class Client {
    private String nume;
    private String nrTelefon;
    private String email;

    public Client(String email, String nrTelefon, String nume) {
        this.email = email;
        this.nrTelefon = nrTelefon;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("email='").append(email).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
