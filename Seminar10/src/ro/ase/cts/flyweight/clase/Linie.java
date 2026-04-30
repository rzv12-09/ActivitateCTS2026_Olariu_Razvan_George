package ro.ase.cts.flyweight.clase;

public class Linie implements LinieDeTransport {
    private int numarLinie;
    private String primaStatie;
    private String ultimaStatie;

    protected Linie(int numarLinie, String primaStatie, String ultimaStatie) {
        this.numarLinie = numarLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseazaAutobuzLinie(Autobuz autobuz) {
        StringBuilder sb = new StringBuilder("Autobuzul:");
        sb.append(autobuz.toString());
        sb.append(" \nCircula pe linia :");
        sb.append(this.toString());
        System.out.print(sb.toString());
    }

    @Override
    public void afiseazaNumarMaximCalatoriPeTraseu(Autobuz autobuz) {
        StringBuilder sb = new StringBuilder("De la statia ");
        sb.append(this.primaStatie);
        sb.append(" pana la statia ");
        sb.append(this.ultimaStatie);
        sb.append(" pot merge maxim ");
        sb.append(autobuz.getNrLocuri());
        sb.append(" calatori");
        System.out.println(sb.toString());

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("numarLinie=").append(numarLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
