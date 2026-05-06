package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    static void main(String[] args) {
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setSuccesor(calatorieAutobuz);
        calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieTramvai.setSuccesor(calatorieMetrou);

        System.out.println("Pentru 5 km este recomandat: " + calatorieTroleibuz.getRecomandareTransport(5));
        System.out.println("Pentru 12 km este recomandat: " + calatorieTroleibuz.getRecomandareTransport(12));
        System.out.println("Pentru 2 km este recomandat: " + calatorieTroleibuz.getRecomandareTransport(2));
        System.out.println("Pentru 4 km este recomandat: " + calatorieTroleibuz.getRecomandareTransport(4));
    }
}
