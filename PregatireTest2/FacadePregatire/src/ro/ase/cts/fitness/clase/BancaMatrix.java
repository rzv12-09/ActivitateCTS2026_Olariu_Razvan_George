package ro.ase.cts.fitness.clase;

public class BancaMatrix {
    private int nivelInclinatie;
    public void seteazaInclinatie() {
        this.nivelInclinatie = 3;
        System.out.println("Inclinatia bancii a fost resetata la nivelul 3");
    }

    public BancaMatrix(int nivelInclinatie) {
        this.nivelInclinatie = nivelInclinatie;
    }
}
