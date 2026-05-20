package ro.ase.cts.fitness.clase;

public class PregatireAparatFacade {
    private BancaMatrix bancaMatrix;
    private GestiuneGreutati gestiuneGreutati;
    private  SistemJurnal sistemJurnal;

    public PregatireAparatFacade() {
        this.bancaMatrix = new BancaMatrix(8);
        this.gestiuneGreutati = new GestiuneGreutati();
        this.sistemJurnal = new SistemJurnal();
    }

    public void pregatesteStatie(Sportiv sportiv,double greutateAparat) {
        this.bancaMatrix.seteazaInclinatie();
        this.gestiuneGreutati.selecteazaGreutate(greutateAparat);
        this.sistemJurnal.inregistreazaSesiune(sportiv);
    }
}
