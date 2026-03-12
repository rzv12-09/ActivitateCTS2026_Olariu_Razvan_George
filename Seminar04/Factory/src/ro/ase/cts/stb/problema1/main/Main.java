package ro.ase.cts.stb.problema1.main;

import ro.ase.cts.stb.problema1.factory.MijlocTransportFactory;
import ro.ase.cts.stb.problema1.factory.TipMijlocTransport;
import ro.ase.cts.stb.problema1.vehicule.MijlocTransport;

public class Main {
    static void main(String[] args) throws Exception {
        MijlocTransportFactory factory = new MijlocTransportFactory();

        MijlocTransport autobuz = factory.getMijlocTransport("Mercedes",
                3.00,
                TipMijlocTransport.AUTOBUZ);
        MijlocTransport troleibuz = factory.getMijlocTransport("Astra",
                3.00,
                TipMijlocTransport.TROLEIBUZ);
        MijlocTransport tramvai = factory.getMijlocTransport("Mercedes",
                3.00,
                TipMijlocTransport.TRAMVAI);
        tramvai.afiseazaDescriere();
        troleibuz.afiseazaDescriere();
        autobuz.afiseazaDescriere();
    }
}
