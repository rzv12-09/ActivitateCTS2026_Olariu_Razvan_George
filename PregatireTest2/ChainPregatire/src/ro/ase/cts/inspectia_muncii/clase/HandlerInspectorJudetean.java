package ro.ase.cts.inspectia_muncii.clase;

public class HandlerInspectorJudetean extends SesizareHandler {

    @Override
    public void proceseazaSesizare(int nrAngajatiAfectati) {
        if(nrAngajatiAfectati < 50) {
            System.out.println("Sesizarea care afecteaza " + nrAngajatiAfectati + " va fi procesata de un Inspector Judetean");
            return;
        }
        super.succesor.proceseazaSesizare(nrAngajatiAfectati);
    }
}
