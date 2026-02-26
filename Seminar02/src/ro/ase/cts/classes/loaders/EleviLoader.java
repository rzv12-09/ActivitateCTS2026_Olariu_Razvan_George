package ro.ase.cts.classes.loaders;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviLoader extends DataLoader {

    @Override
    public List<Aplicant> load(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Aplicant aplicant = new Elev();
            super.loadAplicantData(input2,aplicant);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            Elev elev = (Elev) aplicant;
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
