package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.loaders.AngajatiLoader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;

		try {
			listaAngajati = (new AngajatiLoader()).load("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
