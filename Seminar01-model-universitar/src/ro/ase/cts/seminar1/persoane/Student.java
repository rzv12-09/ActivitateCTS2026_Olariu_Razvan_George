package ro.ase.cts.seminar1.persoane;

public class Student extends Persoana{
    private String idStudent;

    public String getIdStudent(){
        return idStudent;
    }

    public Student(String nume, int varsta, String idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }
}
