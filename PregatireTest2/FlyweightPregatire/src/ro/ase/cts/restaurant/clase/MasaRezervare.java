package ro.ase.cts.restaurant.clase;

public class MasaRezervare implements MasaRestaurant {
    private int numarMasa;
    private int nrPersoane;
    private String oraRezervare;

    public MasaRezervare(int nrPersoane, int numarMasa, String oraRezervare) {
        this.nrPersoane = nrPersoane;
        this.numarMasa = numarMasa;
        this.oraRezervare = oraRezervare;
    }


    @Override
    public void afiseazaDetaliiRezervare(Client client) {
        System.out.println("Detalii client:" + client.toString());
        System.out.println("Detalii rezervare:" + this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MasaRezervare{");
        sb.append("nrPersoane=").append(nrPersoane);
        sb.append(", numarMasa=").append(numarMasa);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
