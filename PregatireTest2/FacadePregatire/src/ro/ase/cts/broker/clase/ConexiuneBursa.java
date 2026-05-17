package ro.ase.cts.broker.clase;

public class ConexiuneBursa {
    public void trimiteOrdinPlata(Client client,double sumaFinala, String companie) {
        client.setSold(client.getSold() - sumaFinala);
        System.out.println("Clientul " + client.getNume() + " a cumparat actiuni la compania " + companie + " in valoare de " + sumaFinala + " lei!");
    }
}
