package ro.ase.cts.club.prototype;

import java.util.ArrayList;
import java.util.List;

public class Jucator implements JucatorPrototype {
    private String nume;
    private String tipJucator;
    private List<String> antrenamente;
    private List<String> medicamenteInterzise;

    public Jucator() {
    }

    public Jucator( String tipJucator, List<String> antrenamente, List<String> medicamenteInterzise) {
        this.tipJucator = tipJucator;
        this.antrenamente = antrenamente;
        this.medicamenteInterzise = medicamenteInterzise;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void adaugaAntrenamentPersonalizat(String antrenament) {
        this.antrenamente.add(antrenament);
    }

    public void raporteazaMedicamentInterzis(String medicament) {
        this.medicamenteInterzise.add(medicament);
    }

    @Override
    public JucatorPrototype clone() {
        Jucator jucator = new Jucator();
        jucator.nume = "Necunoscut";
        jucator.tipJucator = this.tipJucator;
        jucator.medicamenteInterzise = this.medicamenteInterzise;
        jucator.antrenamente = new ArrayList<>();
        for(String antrenament : this.antrenamente) {
            jucator.antrenamente.add(antrenament);
        }
        return jucator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", tipJucator='").append(tipJucator).append('\'');
        sb.append(", antrenamente=").append(antrenamente);
        sb.append(", medicamenteInterzise=").append(medicamenteInterzise);
        sb.append('}');
        return sb.toString();
    }
}
