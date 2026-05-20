package ro.ase.cts.foto.clase;

public class AplicaPreset implements Comanda {
    private ModulProcesareImagine modulProcesareImagine;

    public AplicaPreset(ModulProcesareImagine modulProcesareImagine) {
        this.modulProcesareImagine = modulProcesareImagine;
    }

    @Override
    public void executa() {
        this.modulProcesareImagine.aplicaAjustari();
    }
}
