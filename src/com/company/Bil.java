package com.company;

public abstract class Bil {

    protected String regNr;
    protected String mærke;
    protected String model;
    protected String årgang;
    protected int antalDøre;

    public Bil (String regNr, String mærke, String model, String årgang, int antalDøre){
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }


    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getÅrgang() {
        return årgang;
    }

    public void setÅrgang(String årgang) {
        this.årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    //abstrakte metoder indeholder ikke en krop dvs. {}
    public abstract double beregnGrønEjerafgift();


    @Override
    public String toString() {
        return mærke + " " + model + " med reg.nr. [" +
               regNr + "] fra " + årgang + " med " + antalDøre + " døre.";
    }
}
