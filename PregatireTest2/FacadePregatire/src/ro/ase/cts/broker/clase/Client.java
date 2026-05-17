package ro.ase.cts.broker.clase;

public class Client {
    private double sold;
    private String nume;

    public Client(double sold, String nume) {
        this.sold = sold;
        this.nume = nume;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
