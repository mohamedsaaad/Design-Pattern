package BehaviouralDesignPattern.ObserverDesignPattern;

public class Programmer implements  IObserver{
    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
