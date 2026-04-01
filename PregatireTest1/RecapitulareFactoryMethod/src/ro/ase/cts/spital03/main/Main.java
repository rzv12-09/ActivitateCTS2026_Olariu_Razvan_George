package ro.ase.cts.spital03.main;

import ro.ase.cts.spital03.classes.AngajatSpital;
import ro.ase.cts.spital03.enums.TipAngajatMedical;
import ro.ase.cts.spital03.enums.TipAngajatNonMedical;
import ro.ase.cts.spital03.factory.FabricaAngajat;
import ro.ase.cts.spital03.factory.FabricaAngajatMedical;
import ro.ase.cts.spital03.factory.FabricaAngajatNonMedical;

public class Main {
    static void main(String[] args) {
        FabricaAngajat fabricaAngajatMedical = new FabricaAngajatMedical();
        FabricaAngajat fabricaAngajatNonMedical = new FabricaAngajatNonMedical();

        AngajatSpital medic = fabricaAngajatMedical.creareAngajat(TipAngajatMedical.MEDIC,"Andrei",2000,"Ortopedie");
        AngajatSpital asistent = fabricaAngajatMedical.creareAngajat(TipAngajatMedical.ASISTENT,"Mircea",2000,"Ortopedie");
        AngajatSpital registrator = fabricaAngajatNonMedical.creareAngajat(TipAngajatNonMedical.REGISTRATOR,"Nicoleta",2000);

        medic.incepeProgram();
        asistent.incepeProgram();
        registrator.incepeProgram();
    }
}
