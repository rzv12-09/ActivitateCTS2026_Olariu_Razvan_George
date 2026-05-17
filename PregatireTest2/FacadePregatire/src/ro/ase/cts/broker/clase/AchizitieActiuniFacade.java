package ro.ase.cts.broker.clase;

public class AchizitieActiuniFacade {
    private CalculatorTaxa calculatorTaxa;
    private ConexiuneBursa conexiuneBursa;
    private GestiunePortofel gestiunePortofel;

    public AchizitieActiuniFacade() {
        this.calculatorTaxa = new CalculatorTaxa();
        this.conexiuneBursa = new ConexiuneBursa();
        this.gestiunePortofel = new GestiunePortofel();
    }

    public void executaAchizitieActiuni(Client client,String companie, double sumaInitiala) {
        if (this.gestiunePortofel.areFonduriSuficiente(client,sumaInitiala)) {
            sumaInitiala = this.calculatorTaxa.calculeazaSumaTranzactieTaxata(sumaInitiala,0.05);
            this.conexiuneBursa.trimiteOrdinPlata(client,sumaInitiala,companie);
        } else {
            System.out.println("Fonduri insuficiente pentru tranzactie!");
        }
    }
}
