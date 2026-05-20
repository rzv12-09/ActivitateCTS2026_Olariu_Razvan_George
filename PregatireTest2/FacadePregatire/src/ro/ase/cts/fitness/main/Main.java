package ro.ase.cts.fitness.main;

import ro.ase.cts.fitness.clase.PregatireAparatFacade;
import ro.ase.cts.fitness.clase.Sportiv;

public class Main {
    static void main(String[] args) {
        Sportiv sportiv = new Sportiv(82.3,"Razvan",21);
        PregatireAparatFacade pregatireAparatFacade = new PregatireAparatFacade();
        pregatireAparatFacade.pregatesteStatie(sportiv,40.5);
    }
}
