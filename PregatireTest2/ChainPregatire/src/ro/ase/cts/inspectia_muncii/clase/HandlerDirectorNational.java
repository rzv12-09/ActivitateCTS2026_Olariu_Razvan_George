package ro.ase.cts.inspectia_muncii.clase;

public class HandlerDirectorNational extends SesizareHandler {

    @Override
    public void proceseazaSesizare(int nrAngajatiAfectati) {
        System.out.println("Sesizarea care afecteaza " + nrAngajatiAfectati + " va fi procesata de Directorul National");

    }
}
