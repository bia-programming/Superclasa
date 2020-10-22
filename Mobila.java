package com.company;

public class Mobila {
    String tipLemn;
    String material;
    boolean eStejar;
    double lungime;
    double latime;
    double inaltime;

    public Mobila() {
    }

    public Mobila(String tipLemn, String material, boolean eStejar, double lungime, double latime, double inaltime) {
        this.tipLemn = tipLemn;
        this.material = material;
        this.eStejar = eStejar;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public Mobila(String tipLemn, double lungime, double latime, double inaltime) {
        this.tipLemn = tipLemn;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public Mobila(double lungime, double latime, double inaltime) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public Mobila(String material, boolean eStejar) {
        this.material = material;
        this.eStejar = eStejar;
    }

    void Break() {
        System.out.println("breaking!");
    }

    void restore() {
        System.out.println("restoring!");
    }
}
