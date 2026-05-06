package ro.ase.cts.clase.student;

import ro.ase.cts.clase.strategy.ModSustinereExamen;
import ro.ase.cts.clase.strategy.ProbaScrisa;

public class Student {
    private String nume;

    private ModSustinereExamen modSustinereExamen;



    public Student(String nume){
        this.modSustinereExamen = new ProbaScrisa();
        this.nume = nume;
    }

    public void alegeMetoda(ModSustinereExamen modSustinereExamen) {
        this.modSustinereExamen = modSustinereExamen;
    }

    public void initiereExamen() {
        this.modSustinereExamen.sustinereExamen();
    }
}
