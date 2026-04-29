package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.NotaDePlata;
import ro.ase.cts.decorator.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.decorator.NotaDePlataFelicitare;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(150,String.valueOf(LocalDate.now()));
        notaDePlata.printeaza();
        int a = 1;
        NotaDePlataDecorator notaDePlataDecorator = (a == 1) ?  new NotaDePlataFelicitare(notaDePlata) : new NotaDePlata1Mai(notaDePlata);
        notaDePlataDecorator.printeazaFelicitare();
    }
}
