package ro.ase.cts.classes.loaders;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiLoader extends DataLoader {

    @Override
    public List<Aplicant> load(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Aplicant aplicant = new Angajat();
            super.loadAplicantData(input2,aplicant);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            Angajat angajat = (Angajat) aplicant;
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
