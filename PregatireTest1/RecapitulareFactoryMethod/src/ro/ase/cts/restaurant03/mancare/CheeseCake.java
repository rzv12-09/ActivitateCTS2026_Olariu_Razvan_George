package ro.ase.cts.restaurant03.mancare;

import java.util.UUID;

public class CheeseCake extends  Desert {

    public CheeseCake(double calorii) {
        super(calorii);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("CheeseCake: ");
        sb.append(super.toString());
        System.out.println(sb.toString());
    }
}
