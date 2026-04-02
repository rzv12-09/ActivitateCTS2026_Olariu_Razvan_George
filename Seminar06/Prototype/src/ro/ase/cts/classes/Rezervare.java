package ro.ase.cts.classes;

public class Rezervare implements PrototypeRezervare {
    private String numeClient;
    private int nrPersoane;
    private String ora;
    private String nrTelefon;

    public Rezervare(String numeClient, int nrPersoane, String ora, String nrTelefon) {
        this.numeClient = "Client";
        this.nrPersoane = 1;
        this.ora = ora;
        this.nrTelefon= "0711111111";
        if(numeClient.length() >= 3) {
            this.numeClient = numeClient;
        }
        if(nrPersoane >= 1) {
            this.nrPersoane = nrPersoane;
        }
        if(nrTelefon.length() == 10) {
            this.nrTelefon = nrTelefon;
        }
    }

    private Rezervare() {}

    @Override
    public PrototypeRezervare copy() {
        Rezervare rezervare = new Rezervare();
        rezervare.numeClient = this.numeClient;
        rezervare.nrPersoane = this.nrPersoane;
        rezervare.ora = this.ora;
        rezervare.nrTelefon = this.nrTelefon;
        return rezervare;
    }



    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ora='").append(ora).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
