package ro.ase.cts.stb.clase;

public abstract class DecoratorBilet implements Bilet {
    protected Bilet bilet;

    @Override
    public void printeazaBilet() {
        this.bilet.printeazaBilet();
    }

    public DecoratorBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public int getValabilitate() {
        return this.bilet.getValabilitate();
    }

    public abstract void printeazaBiletPersonalizat();


}
