package ro.ase.cts.broker.clase;

public class CalculatorTaxa {
    public double calculeazaSumaTranzactieTaxata(double sumaTranzactie,double procentTaxare) {
        return sumaTranzactie - sumaTranzactie * procentTaxare;
    }
}
