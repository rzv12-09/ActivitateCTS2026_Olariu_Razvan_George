package ro.ase.cts.proxy.clase;

public class AutobuzDeNoapte implements MijlocTransport {
    private MijlocTransport mijlocTransport;

    public AutobuzDeNoapte(MijlocTransport autobuz) {
        this.mijlocTransport = autobuz;
    }

    @Override
    public void oprireStatie() {
        if(this.mijlocTransport.getNrCalatori() != 0) {
            this.mijlocTransport.oprireStatie();
            return;
        }
        System.out.println("Autobuzul se retrage ");
    }

    @Override
    public int getNrCalatori() {
        return this.mijlocTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return this.mijlocTransport.getLinie();
    }
}
