package StructuralDesignPattern.AdapterPattern;

public class TankEnemey implements IEnemey {
    @Override
    public void fireCannons() {
        System.out.println("Tank Firing Cannon!");
    }

    @Override
    public void refillBanzeen() {
        System.out.println("Tank Refilling Banzeen !");
    }
}
