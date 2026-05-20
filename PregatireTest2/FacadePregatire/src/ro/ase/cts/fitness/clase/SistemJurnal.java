package ro.ase.cts.fitness.clase;

public class SistemJurnal {
    public void inregistreazaSesiune(Sportiv sportiv) {
        System.out.println("Sportivul " + sportiv.getNume() + " cu greutatea de " + sportiv.getGreutate() + " a inceput exercitiul!");
    }
}
