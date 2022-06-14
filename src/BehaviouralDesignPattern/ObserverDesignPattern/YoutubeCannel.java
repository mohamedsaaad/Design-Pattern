package BehaviouralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class YoutubeCannel implements IObservable {
    protected List<IObserver> MyObservers=new ArrayList<>();

    public YoutubeCannel(){}

    public YoutubeCannel(List<IObserver> myObservers) {
        this.MyObservers = myObservers;
    }

    public List<IObserver> getMyObservers() {
        return MyObservers;
    }

    public void setMyObservers(List<IObserver> myObservers) {
        MyObservers = myObservers;
    }

    @Override
    public void addSubscriber(IObserver observer) {
        this.MyObservers.add(observer);
    }

    @Override
    public void removeSubscriber(IObserver observer) {
        this.MyObservers.remove(observer);
    }

    @Override
    public abstract void notifySubscriber();
}
