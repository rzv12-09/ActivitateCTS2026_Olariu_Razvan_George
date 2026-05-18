package ro.ase.cts.stb.clase;

public class HandlerTroleibuz extends CalatorieHandler {

    @Override
    public String getRecomandareTransport(double distanta) {
        return distanta < 3.0 ? "Troleibuz" : super.succesor.getRecomandareTransport(distanta);
    }
}
