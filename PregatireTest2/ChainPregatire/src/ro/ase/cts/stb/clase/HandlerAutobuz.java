package ro.ase.cts.stb.clase;

public class HandlerAutobuz extends CalatorieHandler {

    @Override
    public String getRecomandareTransport(double distanta) {
        return distanta < 5.00 ? "Autobuz" : super.succesor.getRecomandareTransport(distanta);
    }
}
