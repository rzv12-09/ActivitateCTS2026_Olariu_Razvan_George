package ro.ase.cts.clase;

public class CalatorieTroleibuz extends CalatorieHandler {

    @Override
    public String getRecomandareTransport(double distanta) {
        if (distanta < 3) {
            return "Troleibuz";
        }
        return super.succesor.getRecomandareTransport(distanta);

    }
}
