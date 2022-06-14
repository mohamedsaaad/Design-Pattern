package BehaviouralDesignPattern.ObserverDesignPattern;

public class FoodCookingFans implements IObserver{
    private String name;

    public FoodCookingFans(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
