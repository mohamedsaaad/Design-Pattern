package BehaviouralDesignPattern.ObserverDesignPattern;

import java.util.List;

public class ProgrammingChannel extends YoutubeCannel{
    public ProgrammingChannel() {
    }

    public ProgrammingChannel(List<IObserver> myObservers) {
        super(myObservers);
    }

    @Override
    public void notifySubscriber() {
        for ( IObserver observer: MyObservers) {
            System.out.println("hello "+ observer.toString() +" from Programming Channel there is a new Video!");
        }
    }
}
