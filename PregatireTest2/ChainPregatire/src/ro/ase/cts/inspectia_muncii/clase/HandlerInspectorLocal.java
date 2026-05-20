package ro.ase.cts.inspectia_muncii.clase;

public class HandlerInspectorLocal extends SesizareHandler {


    @Override
    public void proceseazaSesizare(int nrAngajatiAfectati) {
        if(nrAngajatiAfectati < 5) {
            System.out.println("Sesizarea care afecteaza " + nrAngajatiAfectati + " va fi procesata de un Inspector Local");
            return;
        }
        super.succesor.proceseazaSesizare(nrAngajatiAfectati);
    }
}
