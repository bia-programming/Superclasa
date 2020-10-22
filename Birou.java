package com.company;

public class Birou extends Mobila {
    int nrSertare;
    boolean extraRaft;
    int nrManere;
    String material;

    public Birou(String tipLemn, String material, boolean eStejar, double lungime, double latime, double inaltime, int nrSertare, boolean extraRaft, int nrManere) {
        super(tipLemn, material, eStejar, lungime, latime, inaltime);
        this.nrSertare = nrSertare;
        this.extraRaft = extraRaft;
        this.nrManere = nrManere;
    }

    public Birou(int nrSertare, boolean extraRaft, int nrManere) {
        super();
        this.nrSertare = nrSertare;
        this.extraRaft = extraRaft;
        this.nrManere = nrManere;
    }

    public Birou(String tipLemn, double lungime, double latime, double inaltime, boolean extraRaft) {
        super(tipLemn, lungime, latime, inaltime);
        this.extraRaft = extraRaft;
    }

    public Birou(String material, double lungime, double latime, double inaltime, int nrSertare) {
        super(material, lungime, latime, inaltime);
        this.nrSertare = nrSertare;
    }

    public Birou(String material, String material1) {
        super.material = material;
        this.material = material1;
    }

    void breakBirou() {
        super.Break();
    }

    void restoreBirou() {
        super.restore();
    }

    void showBirou() {
        System.out.println("Tip lemn: " + super.tipLemn);
        System.out.println("Material: " + super.material);
        System.out.println("E stejar: " + super.eStejar);
        System.out.println("Lungime: " +String.format("%.02f",super.lungime));
        System.out.println("Latime: " + String.format("%.02f",super.latime));
        System.out.println("Inaltime: " +String.format("%.02f",super.inaltime));
        System.out.println("Numar sertare: " + nrSertare);
        System.out.println("Extra raft: " + extraRaft);
        System.out.println("Numar manare: " + nrManere);
    }
}
