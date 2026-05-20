package ro.ase.cts.club.main;

import ro.ase.cts.club.prototype.Jucator;
import ro.ase.cts.club.prototype.JucatorPrototype;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        JucatorPrototype atacant = new Jucator("atacant",new ArrayList<>(Arrays.asList("ceva","ceva")),new ArrayList<>(Arrays.asList("codeina")));
    }
}
