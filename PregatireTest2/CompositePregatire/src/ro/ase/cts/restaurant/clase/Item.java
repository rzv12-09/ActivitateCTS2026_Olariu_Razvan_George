package ro.ase.cts.restaurant.clase;

public class Item implements Structura {
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaNume(String spatii) {
        System.out.println(spatii+ "L_" + this.nume);
    }
}
