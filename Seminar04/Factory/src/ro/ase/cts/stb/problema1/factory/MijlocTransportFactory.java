package ro.ase.cts.stb.problema1.factory;

import ro.ase.cts.stb.problema1.vehicule.Autobuz;
import ro.ase.cts.stb.problema1.vehicule.MijlocTransport;
import ro.ase.cts.stb.problema1.vehicule.Tramvai;
import ro.ase.cts.stb.problema1.vehicule.Troleibuz;

public class MijlocTransportFactory {

    public MijlocTransport getMijlocTransport(String marca,
                                              double pretBilet,
                                              TipMijlocTransport tipMijlocTransport) throws Exception {

        switch (tipMijlocTransport) {
            case AUTOBUZ -> {
                return new Autobuz(marca,pretBilet);
            }
            case TRAMVAI -> {
                return new Tramvai(marca,pretBilet);
            }
            case TROLEIBUZ -> {
                return new Troleibuz(marca,pretBilet);
            }
            default -> {
                throw new Exception("Tip invalid");
            }
        }

    }
}
