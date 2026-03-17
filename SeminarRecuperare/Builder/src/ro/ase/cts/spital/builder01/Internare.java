package ro.ase.cts.spital.builder01;

public class Internare {
    private String numePacient;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalat;

    public Internare() {
        this.numePacient = "-";
        this.arePatRabatabil = false;
        this.areMicDejunInclus = false;
        this.arePapuciCamera = false;
        this.areHalat = false;
    }

    public Internare(String numePacient, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciCamera, boolean areHalat) {
        this.numePacient = numePacient;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalat = areHalat;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    public void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    public void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append(", areHalat=").append(areHalat);
        sb.append('}');
        return sb.toString();
    }
}
