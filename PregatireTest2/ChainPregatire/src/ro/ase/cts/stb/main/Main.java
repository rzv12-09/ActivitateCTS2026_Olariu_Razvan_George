package ro.ase.cts.stb.main;

import ro.ase.cts.stb.clase.*;

public class Main {
    static void main(String[] args) {
        CalatorieHandler troleibuz = new HandlerTroleibuz();
        CalatorieHandler autobuz = new HandlerAutobuz();
        CalatorieHandler tramvai = new HandlerTramvai();
        CalatorieHandler metrou = new HandlerMetrou();

        troleibuz.setSuccesor(autobuz);
        autobuz.setSuccesor(tramvai);
        tramvai.setSuccesor(metrou);

        System.out.println(troleibuz.getRecomandareTransport(2));
        System.out.println(troleibuz.getRecomandareTransport(3));
        System.out.println(troleibuz.getRecomandareTransport(6));
        System.out.println(troleibuz.getRecomandareTransport(12));
    }
}
