package ro.ase.cts.agentie.main;

import ro.ase.cts.agentie.agentie.RezervareBilet;
import ro.ase.cts.agentie.companie_aeriana.API;
import ro.ase.cts.agentie.companie_aeriana.AdaptorBilet;
import ro.ase.cts.agentie.companie_aeriana.Bilet;
import ro.ase.cts.agentie.companie_aeriana.RezervareLowCost;

public class Main {
    static void main(String[] args) {
        Bilet rezervareLowCost = new RezervareLowCost(50,60);

        RezervareBilet biletVechi = new RezervareBilet(70);

        AdaptorBilet biletAdaptat = new AdaptorBilet(biletVechi);
        API.proceseazaBilet(rezervareLowCost);
        API.proceseazaBilet(biletAdaptat);
    }
}
