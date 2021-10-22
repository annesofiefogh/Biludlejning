package com.company;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Bil> biler = new ArrayList<>();

    public Garage(){
    }

    //listen holder bare biler - ligeglad med typen

    public void tilføjBiler(Bil bil){
        biler.add(bil);
    }

    public double beregnGrønEjerafgift() {
        double samletGrønEjerAfgift = 0;
        for (Bil b : biler) {
            samletGrønEjerAfgift += b.beregnGrønEjerafgift();
        }
        return samletGrønEjerAfgift;
    }

    @Override
    public String toString() {
        String bilerIGaragen = "";
        for (Bil bil : biler) {
            bilerIGaragen += bil;
        }
        return "I garagen holder der følgende biler: " + "\n" + bilerIGaragen;
    }

}
