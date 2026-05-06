package ro.ase.cts.clase;

public class CalatorieAutobuz extends CalatorieHandler {
    @Override
    public String getRecomandareTransport(double distanta) {
        if (distanta < 5 ) {
            return "Autobuz";
        }
        return super.succesor.getRecomandareTransport(distanta);
    }
}
