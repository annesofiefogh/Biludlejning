package com.company;

public class Elbil extends Bil {

    private double batterikapacitetKWh;
    private double maxKm;
    private double whPrKm;

    public Elbil (String regNr, String mærke, String model, String årgang, int antalDøre, double batterikapacitetKWh, double maxKm, double whPrKm){
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public double getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(double batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(double maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double kmPrLElbil = ((whPrKm/91.25)/100);
        if (kmPrLElbil >= 20 && kmPrLElbil <= 50){
            return 330;
        } else if (kmPrLElbil >= 15 && kmPrLElbil < 20){
            return 1050;
        } else if (kmPrLElbil >= 10 && kmPrLElbil < 15){
            return 2340;
        } else if (kmPrLElbil >= 5 && kmPrLElbil < 10) {
            return 5500;
        } else if (kmPrLElbil < 5) {
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\n\nElbilen: " +
               "\n" + super.toString() +
               "\nBatterikapaciteten i KWh er: " + batterikapacitetKWh +
               "\nDen kører maks.: " + maxKm + " km på literen." +
               "\nWhatt brugt pr. km: " + whPrKm;
    }
}
