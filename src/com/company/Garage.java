package com.company;

import java.util.ArrayList;

public class Garage {

    public Garage(){
    }

    //listen holder bare biler - ligeglad med typen
    ArrayList<Bil> biler = new ArrayList<>();

    public void tilføjBiler(Bil bil){
        biler.add(bil);
    }

    public double beregnGrønEjerafgift() {
        double sum = 0;
        for (Bil b : biler) {
            sum += b.beregnGrønEjerafgift();
        }
        return sum;
    }

    @Override
    public String toString() {
        String sum = "";
        for (Bil bil : biler) {
            sum += bil;
        }
        return "I garagen holder der følgende biler: " + "\n" + sum +
               "\n\nSamlet grønne afgift for alle bilerne i garagen: " + beregnGrønEjerafgift();
    }

}
