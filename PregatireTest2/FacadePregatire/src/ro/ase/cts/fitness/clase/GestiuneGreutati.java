package ro.ase.cts.fitness.clase;

public class GestiuneGreutati {
    private double greutateCurenta;
    public void selecteazaGreutate(double greutate) {
        this.greutateCurenta = greutate;
        System.out.println("Aparatul a fost setat la " + this.greutateCurenta + " kg!");
    }

    public GestiuneGreutati() {
        this.greutateCurenta = 5;
    }
}
