package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaDePlata;
import ro.ase.cts.decorator.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
     private NotaDePlataAbstract notaDePlata;

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }

    public abstract void printeazaFelicitare();

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlata) {
        this.notaDePlata = notaDePlata;
    }
}
