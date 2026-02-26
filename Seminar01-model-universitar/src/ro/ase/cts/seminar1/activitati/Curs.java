package ro.ase.cts.seminar1.activitati;

import ro.ase.cts.seminar1.persoane.Profesor;
import ro.ase.cts.seminar1.persoane.Student;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private Profesor profesor;
    private List<Student> studenti;

    public String getNumeCurs() {
        return numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public Curs(String numeCurs, int credite, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = new ArrayList<>();
    }
}
