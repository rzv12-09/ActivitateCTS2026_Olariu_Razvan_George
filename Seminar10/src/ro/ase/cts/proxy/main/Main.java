package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.Autobuz;
import ro.ase.cts.proxy.clase.AutobuzDeNoapte;
import ro.ase.cts.proxy.clase.MijlocTransport;

public class Main {
    static void main(String[] args) {
        MijlocTransport mijlocTransport = new Autobuz("66",3);
        mijlocTransport.oprireStatie();
        mijlocTransport.oprireStatie();


        MijlocTransport mijlocTransportFaraCalatori = new Autobuz("26",0);
        mijlocTransportFaraCalatori.oprireStatie();
        MijlocTransport autobuzNoapte = new AutobuzDeNoapte(mijlocTransportFaraCalatori);
        autobuzNoapte.oprireStatie();
    }
}
