package com.company;

public class Benzinbil extends Bil {

    private int oktantal;
    private double kmPrL;

    public Benzinbil (String regNr, String mærke, String model, String årgang, int antalDøre, int oktantal, double kmPrL){
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønEjerafgift() {
        if (kmPrL >= 20 && kmPrL <= 50){
            return 330;
        } else if (kmPrL >= 15 && kmPrL < 20){
            return 1050;
        } else if (kmPrL >= 10 && kmPrL < 15){
            return 2340;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            return 5500;
        } else if (kmPrL < 5) {
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\nBenzinbilen: " +
               "\n" + super.toString() +
               "\nOktantal på " + oktantal + " og den kører " + kmPrL + " km/L.";
    }
}
