package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.clase.Item;
import ro.ase.cts.restaurant.clase.Sectiune;
import ro.ase.cts.restaurant.clase.Structura;

public class Main {
    static void main(String[] args) {
        Structura meniu = new Sectiune("Meniu");
        Structura bauturi = new Sectiune("Bauturi");
        Structura desert = new Sectiune("Desert");
        Structura sucuri = new Sectiune("Sucuri");

        Structura papanasi = new Item("Papanasi");
        Structura pepsi = new Item("Pepsi");
        Structura cola = new Item("Cola");
        Structura apa = new Item("Apa");

        ((Sectiune)meniu).adaugaStructura(bauturi);
        ((Sectiune)meniu).adaugaStructura(desert);

        ((Sectiune)desert).adaugaStructura(papanasi);

        ((Sectiune)bauturi).adaugaStructura(sucuri);
        ((Sectiune)bauturi).adaugaStructura(apa);
        ((Sectiune)sucuri).adaugaStructura(pepsi);
        ((Sectiune)sucuri).adaugaStructura(cola);

        meniu.afiseazaNume(" ");

    }
}
