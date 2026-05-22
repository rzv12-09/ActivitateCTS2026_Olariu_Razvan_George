package ro.ase.cts.agentie.companie_aeriana;

public class RezervareLowCost implements Bilet {
    private int pretBilet;

    public RezervareLowCost(int pretBilet1,int pretBilet2) {
        this.pretBilet = Math.min(pretBilet1, pretBilet2);
    }

    @Override
    public void cumparaBilet() {
        System.out.println("A fost achizitionat biletul low cost in valoare de " + this.pretBilet + " lei!");
    }

    @Override
    public int getPret() {
        return this.pretBilet;
    }
}
