package ro.ase.cts.e_commerce.clase;

public class Client {
    private ModLivrare modLivrare;

    public Client(ModLivrare modLivrare) {
        this.modLivrare = modLivrare;
    }

    public void setModLivrare(ModLivrare modLivrare) {
        this.modLivrare = modLivrare;
    }

    public void trimiteComanda() {
        modLivrare.proceseazaComanda();
    }
}
