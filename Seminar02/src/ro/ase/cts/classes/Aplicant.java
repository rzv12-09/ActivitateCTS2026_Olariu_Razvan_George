package ro.ase.cts.classes;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;
    private static int pragPunctaj;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public static void setPragPunctaj(int pragPunctaj) {
        Aplicant.pragPunctaj = pragPunctaj;
    }

    public void afisareStatut() {
        StringBuilder sb = new StringBuilder("Aplicantul ");
        sb.append(this.nume).append(" ").append(this.prenume);
        sb.append((this.punctaj > Aplicant.pragPunctaj) ? " a fost acceptat" : " nu a fost acceptat");
        System.out.println(sb.toString());
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public abstract void afisareFinantare();


    public Aplicant() {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setNrProiecte(int nr_proiecte, String[] listaProiecte) {
        this.nrProiecte = nr_proiecte;
        this.denumireProiect = listaProiecte;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", nrProiecte=").append(nrProiecte);
        sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
        sb.append('}');
        return sb.toString();
    }
}
