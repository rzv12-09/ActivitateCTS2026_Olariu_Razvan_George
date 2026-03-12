package ro.ase.cts.lazy;
//identificam problema
//mapam problema pe un design pattern
//vedem diagrama de la patternul indentificat
//identificam participantii din diagrama pe problema noastra
public class Hotel {
    private String denumireHotel;
    private int numarCamere;
    private int numarCamereInchriate;
    private int numarAngajati;
    private static Hotel instanta = null;

    public void inchriazaCamera() {
        if(this.numarCamere == this.numarCamereInchriate) {
            System.out.println("Nu mai exista camere disponobile");
        } else {
            this.numarCamereInchriate++;
            System.out.println("Camera a fost inchiriata!");
        }

    }

    private Hotel(String denumireHotel, int numarCamere, int numarAngajati) {
        this.denumireHotel = denumireHotel;
        this.numarCamere = numarCamere;
        this.numarCamereInchriate = 0;
        this.numarAngajati = numarAngajati;
    }

    public static synchronized Hotel getInstance(String denumire,int numarCamere,int numarAngajati) {
        if(instanta == null) {
            instanta = new Hotel(denumire,numarCamere,numarAngajati);
        }
        return  instanta;
    }
}
