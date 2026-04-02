package ro.ase.cts.spital04.main;

import ro.ase.cts.spital04.classes.PrototypeReteta;
import ro.ase.cts.spital04.classes.Reteta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<String,Double> cantitatiIngrediente = new HashMap<>();
        cantitatiIngrediente.put("solutie1",12.0);
        cantitatiIngrediente.put("solutie2",1.0);

        PrototypeReteta reteta = new Reteta("paracetamol",cantitatiIngrediente);
        System.out.println(reteta.toString());
        PrototypeReteta reteta1 = reteta.copy();
        ((Reteta)reteta1).setDenumire("ibuprofen");
        System.out.println(reteta1);
    }
}
