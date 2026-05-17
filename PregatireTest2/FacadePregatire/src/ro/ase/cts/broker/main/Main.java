package ro.ase.cts.broker.main;

import ro.ase.cts.broker.clase.AchizitieActiuniFacade;
import ro.ase.cts.broker.clase.Client;

public class Main {
    static void main(String[] args) {
        Client client = new Client(200,"Razvan");
        AchizitieActiuniFacade achizitieActiuniFacade = new AchizitieActiuniFacade();
        achizitieActiuniFacade.executaAchizitieActiuni(client,"NVIDIA",300);
        achizitieActiuniFacade.executaAchizitieActiuni(client,"NVIDIA",200);

        achizitieActiuniFacade.executaAchizitieActiuni(client,"NVIDIA",10);


    }
}
