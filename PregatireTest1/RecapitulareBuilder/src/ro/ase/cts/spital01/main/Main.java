package ro.ase.cts.spital01.main;

import ro.ase.cts.spital01.builder.AbstractBuilder;
import ro.ase.cts.spital01.builder.Internare;
import ro.ase.cts.spital01.builder.InternareBuilder;

public class Main {
    static void main(String[] args) {
        AbstractBuilder builder = new InternareBuilder();
        Internare internare1 = builder.setArePapuci(true).build("Razvan");
        Internare internare2 = builder.build("Andrei");
        System.out.println(internare2);
    }
}
