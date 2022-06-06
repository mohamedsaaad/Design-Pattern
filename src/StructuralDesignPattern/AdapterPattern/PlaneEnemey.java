package StructuralDesignPattern.AdapterPattern;

public class PlaneEnemey implements IEnemey {
    @Override
    public void fireCannons() {
        System.out.println("Plane Firing Cannon !");
    }

    @Override
    public void refillBanzeen() {
        System.out.println("Plane Refilling Banzeen !");

    }
}
