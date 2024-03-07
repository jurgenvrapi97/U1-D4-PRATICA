package entities;

public class DipendenteFullTime extends Dipendente {


    public DipendenteFullTime(int matricola) {
        super(matricola, calculateSalary());
    }


    public static double calculateSalary() {
        return 1500 * 14;

    }

    @Override
    public String toString() {
        return "DipendenteFullTime [Matricola: " + getMatricola() + ", Stipendio: " + getStipendio() + "]";
    }

    @Override
    public void checkIn() {
        System.out.println(getMatricola() + " ha iniziato a lavorare");
    }
}
