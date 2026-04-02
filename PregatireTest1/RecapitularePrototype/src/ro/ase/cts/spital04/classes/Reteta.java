package ro.ase.cts.spital04.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Reteta implements PrototypeReteta {
    String denumire;
    Map<String,Double> cantitatiSolutii;

    public Reteta(String denumire, Map<String,Double> cantitatiSolutii) {
        this.denumire = denumire;
        this.cantitatiSolutii = new HashMap<>();
        for(Map.Entry<String,Double> entry : cantitatiSolutii.entrySet()) {
            double cantitate = entry.getValue();
            if(cantitate > 15 || cantitate < 3) {
                cantitate = 10;
            }
            this.cantitatiSolutii.put(entry.getKey(),cantitate);
        }
    }

    public Reteta() {

    }

    @Override
    public PrototypeReteta copy() {
        Reteta reteta = new Reteta();
        reteta.denumire = this.denumire;
        reteta.cantitatiSolutii = new HashMap<>();
        for(Map.Entry<String,Double> entry : this.cantitatiSolutii.entrySet()) {
            reteta.cantitatiSolutii.put(entry.getKey(),entry.getValue());
        }
        return reteta;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", cantitatiSolutii=").append(cantitatiSolutii);
        sb.append('}');
        return sb.toString();
    }
}

