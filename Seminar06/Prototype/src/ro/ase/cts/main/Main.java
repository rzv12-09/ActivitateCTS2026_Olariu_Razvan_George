package ro.ase.cts.main;

import ro.ase.cts.classes.PrototypeRezervare;
import ro.ase.cts.classes.Rezervare;

public class Main {
    static void main(String[] args) {
        PrototypeRezervare rezervare1 = new Rezervare("Razvan",2,"22","0749772553");
        PrototypeRezervare rezervare2 = rezervare1.copy();
        ((Rezervare)rezervare2).setNrPersoane(1);
        ((Rezervare)rezervare2).setOra("16");
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
