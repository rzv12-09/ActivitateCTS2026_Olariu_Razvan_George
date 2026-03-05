package ro.ase.cts.classes;

import java.util.Arrays;

public class Elev extends Aplicant {
    private int clasa;
    private String tutore;

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int i) {
        this.clasa = i;
    }

    public String getTutore() {
        return tutore;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    public static int sumaFinantare;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elev{");
        sb.append(super.toString());
        sb.append("clasa=").append(clasa);
        sb.append(", tutore='").append(tutore).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Elev() {
        super();
    }

    public Elev(String nume, String prenume, int varsta, int punctaj,
                int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    public static void setSumaFinantare(int sumaFinantare) {
        Elev.sumaFinantare = sumaFinantare;
    }

    public void afisareFinantare() {
        System.out.println("Angajatul " + super.nume + " " + super.prenume + " primeste" + Elev.sumaFinantare + " Euro/zi in proiect.");
    }

}
