package ro.ase.cts.inspectia_muncii.main;

import ro.ase.cts.inspectia_muncii.clase.HandlerDirectorNational;
import ro.ase.cts.inspectia_muncii.clase.HandlerInspectorJudetean;
import ro.ase.cts.inspectia_muncii.clase.HandlerInspectorLocal;
import ro.ase.cts.inspectia_muncii.clase.SesizareHandler;

public class Main {
    static void main(String[] args) {
        SesizareHandler directorNational = new HandlerDirectorNational();
        SesizareHandler inspectorLocal = new HandlerInspectorLocal();
        SesizareHandler inspectorJudetean = new HandlerInspectorJudetean();

        inspectorLocal.setSuccesor(inspectorJudetean);
        inspectorJudetean.setSuccesor(directorNational);

        inspectorLocal.proceseazaSesizare(46);
        inspectorLocal.proceseazaSesizare(3);
        inspectorLocal.proceseazaSesizare(5);
        inspectorLocal.proceseazaSesizare(52);
    }
}
