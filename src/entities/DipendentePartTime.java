package entities;

public class DipendentePartTime extends Dipendente {

    public DipendentePartTime(int matricola) {
        super(matricola, calculateSalary());
    }


    public static double calculateSalary() {
        return (6 * 8) * 5 * 48;
    }

    @Override
    public String toString() {
        return "DipendentePartTime [Matricola: " + getMatricola() + ", Stipendio: " + getStipendio() + "]";
    }

    @Override
    public void checkIn() {
        System.out.println(getMatricola() + " ha iniziato a lavorare");
    }
}
