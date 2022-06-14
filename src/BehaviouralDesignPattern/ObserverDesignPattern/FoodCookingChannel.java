package BehaviouralDesignPattern.ObserverDesignPattern;

import java.util.List;

public class FoodCookingChannel extends YoutubeCannel{


    public FoodCookingChannel() {
    }

    public FoodCookingChannel(List<IObserver> myObservers) {
        super(myObservers);
    }

    @Override
    public void notifySubscriber() {
        for ( IObserver observer: MyObservers) {
            System.out.println("hello "+ observer.toString() +" from FoodCookingChannel there is a new Video!");
        }
    }
}
