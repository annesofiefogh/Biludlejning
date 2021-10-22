package com.company;

public class Dieselbil extends Bil {

    private boolean harPartikelfilter;
    private double kmPrL;

    public Dieselbil (String regNr, String mærke, String model, String årgang, int antalDøre, boolean harPartikelfilter, double kmPrL){
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public String isHarPartikelfilter(boolean harPartikelfilter) {
        if (harPartikelfilter == true){
            return "JA!";
        } else {
            return "Nej...";
        }
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double tillæg = 0;
        if (harPartikelfilter == false) {
            tillæg += 1000;
        } if (kmPrL >= 20 && kmPrL <= 50){
            tillæg += 130;
        } else if (kmPrL >= 15 && kmPrL < 20){
            tillæg += 1390;
        } else if (kmPrL >= 10 && kmPrL < 15){
            tillæg += 1850;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            tillæg += 2770;
        } else if (kmPrL < 5) {
            tillæg += 15260;
        }
        return tillæg;
    }

    @Override
    public String toString() {
        return "\n\nDieselbilen:" +
               "\n" + super.toString() +
               "\nHar et partikelfilter: " + isHarPartikelfilter(harPartikelfilter) +
               "\nDen kører: " + kmPrL + " km på literen.";
    }
}
