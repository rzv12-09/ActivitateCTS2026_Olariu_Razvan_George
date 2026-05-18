package ro.ase.cts.restaurant.clase;

public class Masa {
    private int id;
    private boolean esteOcupata;
    private boolean esteRezervata;

    public Masa(boolean esteOcupata, boolean esteRezervata, int id) {
        this.esteOcupata = esteOcupata;
        this.esteRezervata = esteRezervata;
        this.id = id;
    }

    public void setEsteOcupata(boolean esteOcupata) {
        this.esteOcupata = esteOcupata;
    }

    public void setEsteRezervata(boolean esteRezervata) {
        this.esteRezervata = esteRezervata;
    }

    public void ocupaMasa() {
        if (this.esteOcupata == true) {
            System.out.println("Masa " + this.id + " este deja ocupata!");
            return;
        }
        System.out.println("Masa " + this.id + " a fost ocupata!!");
        this.esteOcupata = true;
    }

    public void rezervaMasa() {
        if (this.esteRezervata == true) {
            System.out.println("Masa " + this.id + " este deja rezervata!");
            return;
        }
        System.out.println("Masa " + this.id + " a fost rezervata!!");
        this.esteRezervata = true;
    }
}
