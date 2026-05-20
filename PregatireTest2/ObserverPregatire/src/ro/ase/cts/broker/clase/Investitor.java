package ro.ase.cts.broker.clase;

public class Investitor implements Utilizator {
    private String nume;

    public Investitor(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println("Investitorul " + this.nume + " a fost notificat: " +mesaj);
    }
}
