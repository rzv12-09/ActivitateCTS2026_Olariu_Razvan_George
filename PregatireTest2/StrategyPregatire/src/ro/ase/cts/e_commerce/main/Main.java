package ro.ase.cts.e_commerce.main;

import ro.ase.cts.e_commerce.clase.Client;
import ro.ase.cts.e_commerce.clase.LivrareCurier;
import ro.ase.cts.e_commerce.clase.LivrareEasybox;

public class Main {
    static void main(String[] args) {
        Client client = new Client(new LivrareCurier());
        client.setModLivrare(new LivrareEasybox());
        client.trimiteComanda();
    }
}
