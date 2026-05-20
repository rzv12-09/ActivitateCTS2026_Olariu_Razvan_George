package ro.ase.cts.foto.clase;

public class ModulProcesareImagine {
    private int nivelContrast;
    private int nivelExpunere;
    private boolean esteAlbNegru;

    public ModulProcesareImagine(boolean esteAlbNegru, int nivelContrast, int nivelExpunere) {
        this.esteAlbNegru = esteAlbNegru;
        this.nivelContrast = nivelContrast;
        this.nivelExpunere = nivelExpunere;
    }

    public void aplicaAjustari() {
       System.out.println("Ajustarile au fost aplicate pentru imagine: Contrast-"+ this.nivelContrast+" Expunere-"+this.nivelExpunere + " Alb Negru-"+
               (this.esteAlbNegru ? "Da" : "Nu"));

   }
}
