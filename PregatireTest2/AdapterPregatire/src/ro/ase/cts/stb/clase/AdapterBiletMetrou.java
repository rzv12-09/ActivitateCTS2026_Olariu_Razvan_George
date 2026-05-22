package ro.ase.cts.stb.clase;

public class AdapterBiletMetrou implements IBiletMetrou {

    private BiletSTB biletSTB;

    public AdapterBiletMetrou(BiletSTB biletSTB) {
        this.biletSTB = biletSTB;
    }

    @Override
    public void valideazaCalatorieMetrou() {
        this.biletSTB.valideazaCalatorieSTB();
    }
}
