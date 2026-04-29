package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaDePlataAbstract;

import java.time.LocalDate;

public class NotaDePlataFelicitare extends NotaDePlataDecorator {

    public NotaDePlataFelicitare(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani " + (LocalDate.now().getYear() + 1) + "!");
    }
}
