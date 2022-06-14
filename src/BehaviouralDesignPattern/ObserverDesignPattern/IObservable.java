package BehaviouralDesignPattern.ObserverDesignPattern;

public interface IObservable {
    public void addSubscriber(IObserver observer);
    public void removeSubscriber(IObserver observer);
    public void notifySubscriber();
}
