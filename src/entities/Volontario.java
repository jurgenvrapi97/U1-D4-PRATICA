package entities;

public class Volontario implements Lavorare {
    private String nome;
    private int eta;
    private String cv;

    public String getNome() {
        return nome;
    }

    public Volontario(String name, int age, String cvv) {
        nome = name;
        eta = age;
        cv = cvv;
    }

    @Override
    public void checkIn() {
        System.out.println(getNome() + " ha iniziato a lavorare");
    }
}
