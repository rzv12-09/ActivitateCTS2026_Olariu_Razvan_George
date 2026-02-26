package ro.ase.cts.classes.loaders;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsLoaders extends DataLoader {

    @Override
    public List<Aplicant> load(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
           Aplicant aplicant = new Student();
           super.loadAplicantData(input,aplicant);
           int an_studii = input.nextInt();
           String facultate = (input.next()).toString();
           Student student = (Student) aplicant;
           student.setAn_studii(an_studii);
           student.setFacultate(facultate);
           studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
