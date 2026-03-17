package ro.ase.cts.spital.main;

import ro.ase.cts.spital.builder01.AbstractBuilder;
import ro.ase.cts.spital.builder01.Internare;
import ro.ase.cts.spital.builder01.InternareBuilder;
import ro.ase.cts.spital.builder02.AbstractBuilder02;
import ro.ase.cts.spital.builder02.InternareBuilder02;

public class Main {
    static void main(String[] args) {
        Internare internare1 = new Internare();
        internare1.setNumePacient("Cristiano Ronaldo");
        internare1.setArePatRabatabil(true);

        Internare internare2 = new Internare();
        internare2.setNumePacient("Tralalero");

        AbstractBuilder builder = new InternareBuilder("Messi");
        Internare internare3 = builder.setAreHalat(true).build();
        Internare internare4 = builder
                .setNumePacient("Razvan")
                .setArePapuciCamera(true)
                .build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        AbstractBuilder02 builder02 = new InternareBuilder02();
        builder02.setAreMicDejunInclus(true);
        ro.ase.cts.spital.builder02.Internare internare5 = builder02.build("Adrian");
        ro.ase.cts.spital.builder02.Internare internare6 = builder02.build("Gigel");

        System.out.println(internare5);

        internare5.setAreHalat(true);
    }
}
