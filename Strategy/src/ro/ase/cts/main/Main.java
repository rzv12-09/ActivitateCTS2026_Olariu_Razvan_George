package ro.ase.cts.main;

import ro.ase.cts.clase.strategy.Grila;
import ro.ase.cts.clase.strategy.ProbaOrala;
import ro.ase.cts.clase.strategy.ProbaScrisa;
import ro.ase.cts.clase.student.Student;

public class Main {
    static void main(String[] args) {
        Student student  = new Student("Razvan");

        student.alegeMetoda(new Grila());
        student.initiereExamen();
        student.alegeMetoda(new ProbaOrala());
        student.initiereExamen();
        student.alegeMetoda(new ProbaScrisa());
        student.initiereExamen();

    }
}
