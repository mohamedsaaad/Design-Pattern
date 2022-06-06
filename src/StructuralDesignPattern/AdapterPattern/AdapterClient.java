package StructuralDesignPattern.AdapterPattern;

import java.util.ArrayList;

public class AdapterClient {
    public static void main(String[] args) {
        ArrayList<IEnemey> enemeys=new ArrayList<IEnemey>();
        enemeys.add(new TankEnemey());
        enemeys.add(new PlaneEnemey());
        //assume en fe enemy gded bs my byimpelement interface enemy 3shan hwa leh functionalities tanya
        //esmo sardeena masln
        //wda byqsf gabha w bydrab 7agaren
        //w3awez a7oto fe arrayList bta3 el enemy ya3ne 3awez class msh compatible m3 el interface yb2a compatible
        //3mlt class sardena *((----Adaptee----))* wmnf3sh asd5dmo m3 el Ienemy Interface 3shan msh compatiple
        //Fha3ml Adapter ylyshaly :D (Sardenna Adapter) ykon byImpelement IEnemey Interface
        //wy map el faunctions bta3t el adaptee lfunction mwgoda fel interface el asasy
        enemeys.add(new SardeenaAdapter(new Sardeena()));
        for ( IEnemey enemy:enemeys) {
            enemy.fireCannons();
            enemy.refillBanzeen();
        }
    }
}
