package ro.ase.cts.agentie.companie_aeriana;

import ro.ase.cts.agentie.agentie.RezervareBilet;

public class AdaptorBilet implements Bilet {
    private RezervareBilet biletVechi;

    public AdaptorBilet(RezervareBilet biletVechi) {
        this.biletVechi = biletVechi;
    }

    @Override
    public void cumparaBilet() {
        this.biletVechi.rezervaBilet();
    }

    @Override
    public int getPret() {
        return this.biletVechi.getPret();
    }
}
