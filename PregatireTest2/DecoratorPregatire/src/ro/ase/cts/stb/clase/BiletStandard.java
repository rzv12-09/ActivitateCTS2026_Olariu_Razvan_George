package ro.ase.cts.stb.clase;

public class BiletStandard implements Bilet {
    private int valabilitate;

    public BiletStandard(int valabilitate) {
        this.valabilitate = valabilitate;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Bilet standard valabil " + this.valabilitate + " minute!");
    }

    @Override
    public int getValabilitate() {
        return this.valabilitate;
    }
}
