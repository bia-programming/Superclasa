package com.company;

public class Main {

    public static void main(String[] args) {
        Mobila m = new Mobila("Stejar", "Lemn", true, 1.5f, 0.8f, 1.5f);
        Mobila m2 = new Mobila("Ulm", 2.5f, 1.6f, 2.2f);
        Mobila m3 = new Mobila(1.9f, 1.2f, 2.0f);
        Mobila m4 = new Mobila("brad", false);

        m.Break();
        m.restore();

        Birou b = new Birou("Molid","Lemn",false,1.9f,1.21f,2.15f,20,true,20);
        Birou b1=new Birou("Stejar",2.2f,1.8f,2.6f,false);
        Birou b2=new Birou(10,true,6);
        Birou b3=new Birou("Ulm",2.6f,2.0f,2.3f,14);
        Birou b4=new Birou("Brad","Stejar");

        b.breakBirou();
        b.restoreBirou();
        b.showBirou();
    }
}
