package entities;

public abstract class Dipendente implements Lavorare {
    private final int matricola;
    private double stipendio;
    private String dipartimento;

    public Dipendente(int matricola, double stipendio) {
        this.matricola = matricola;
        this.stipendio = stipendio;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }


    public void setDipartimento(String dipartimento) {

        this.dipartimento = String.valueOf(Dipartimenti.valueOf(dipartimento));
    }

    private void calculateSalary() {

    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento='" + dipartimento + '\'' +
                '}';
    }
}
