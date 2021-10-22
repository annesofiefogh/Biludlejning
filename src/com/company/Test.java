package com.company;

public class Test {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Benzinbil benzinbil = new Benzinbil("TS67987", "Volks Wagen", "Golf", "2005", 4, 70, 15);
        Elbil elbil = new Elbil("HG96465", "Tesla", "Musk", "2020", 4, 75, 10, 60000);
        Dieselbil dieselbil = new Dieselbil("CK45678", "Toyota", "Yaris", "2010", 4, true, 25);

        garage.tilføjBiler(benzinbil);
        garage.tilføjBiler(elbil);
        garage.tilføjBiler(dieselbil);

        System.out.println(garage);
        System.out.println("\nSamlet grønne afgift for alle bilerne i garagen: " + garage.beregnGrønEjerafgift());


    }
}
