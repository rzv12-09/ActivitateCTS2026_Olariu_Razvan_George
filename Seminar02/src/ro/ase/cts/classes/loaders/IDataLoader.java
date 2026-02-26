package ro.ase.cts.classes.loaders;

import ro.ase.cts.classes.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface IDataLoader {
    List<Aplicant> load(String file) throws FileNotFoundException;
}
