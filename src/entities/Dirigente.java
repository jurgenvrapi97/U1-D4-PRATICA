package entities;

public class Dirigente extends Dipendente {
    public Dirigente(int matricola) {
        super(matricola, calculateSalary());
    }

    public static double calculateSalary() {
        return 14 * 3000;
    }

    @Override
    public String toString() {
        return "Dirigente [Matricola: " + getMatricola() + ", Stipendio: " + getStipendio() + "]";
    }

    @Override
    public void checkIn() {
        System.out.println(getMatricola() + " ha iniziato a lavorare");
    }
}
