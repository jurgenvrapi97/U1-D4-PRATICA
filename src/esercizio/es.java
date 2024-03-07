package esercizio;

import entities.*;

public class es {
    public static void main(String[] args) {


//        Dipendente dipendente1 = new Dipendente(123, 50000);
//        dipendente1.setDipartimento("PRODUZIONE");
//        Dipendente dipendente2 = new Dipendente(234, 60000);
//        dipendente1.setDipartimento("AMMINISTRAZIONE");
//        Dipendente dipendente3 = new Dipendente(345, 80000);
//        dipendente1.setDipartimento("VENDITE");
//
//
//
//        Dipendente[] dipendenti = {dipendente1,dipendente2,dipendente3};
//       showMat(dipendenti);


        Dipendente dipendenteFullTime = new DipendenteFullTime(123);
        Dipendente dipendenteOPartTime = new DipendentePartTime(234);
        Dipendente dirigente = new Dirigente(345);

        Volontario volontario1 = new Volontario("marco", 25, "nazionale");

        Dipendente[] dipendenti = {dipendenteFullTime, dipendenteOPartTime, dirigente};
        Lavorare[] lavoratori = {dipendenteFullTime, dipendenteOPartTime, dirigente, volontario1};
        showSalary(dipendenti);
        showCheckIn(lavoratori);
    }


    public static void showMat(Dipendente[] dipendenti) {
        for (int i = 0; i < dipendenti.length; i++) {
            int matricola = dipendenti[i].getMatricola();
            System.out.println(matricola);
        }
    }

    public static void showSalary(Dipendente[] dipendenti) {
        for (int i = 0; i < dipendenti.length; i++) {

            System.out.println(dipendenti[i]);
        }
    }

    public static void showCheckIn(Lavorare[] lavoratori) {
        for (int i = 0; i < lavoratori.length; i++) {

            lavoratori[i].checkIn();
        }
    }
}
