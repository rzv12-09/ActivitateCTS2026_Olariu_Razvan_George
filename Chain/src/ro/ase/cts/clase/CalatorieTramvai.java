package ro.ase.cts.clase;

public class CalatorieTramvai extends CalatorieHandler {

    @Override
    public String getRecomandareTransport(double distanta) {
        return distanta < 10 ? "Tramvai" : super.succesor.getRecomandareTransport(distanta);
    }
}
