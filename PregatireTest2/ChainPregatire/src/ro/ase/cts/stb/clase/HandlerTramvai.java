package ro.ase.cts.stb.clase;

public class HandlerTramvai extends CalatorieHandler {

    @Override
    public String getRecomandareTransport(double distanta) {
        return distanta < 10.00 ? "Tramvai" : super.succesor.getRecomandareTransport(distanta);
    }
}
