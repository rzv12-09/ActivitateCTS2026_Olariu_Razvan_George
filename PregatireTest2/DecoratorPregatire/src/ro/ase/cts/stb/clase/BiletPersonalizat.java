package ro.ase.cts.stb.clase;

public class BiletPersonalizat extends DecoratorBilet {

    private String mesaj;

    public BiletPersonalizat(Bilet bilet , String mesaj) {
        super(bilet);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaBiletPersonalizat() {
        System.out.println("Bilet standard valabil " + super.bilet.getValabilitate() + " minute! " + this.mesaj);
    }

    @Override
    public int getValabilitate() {
        return super.getValabilitate();
    }
}
