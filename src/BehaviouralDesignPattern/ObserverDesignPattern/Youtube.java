package BehaviouralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Youtube {

    public static void createDummySubscriberForProgramming(IObservable programmingChannel){
        IObserver programmer1=new Programmer("Saad");
        programmingChannel.addSubscriber(programmer1);
        IObserver programmer2=new Programmer("Amr");
        programmingChannel.addSubscriber(programmer2);
        IObserver programmer3=new Programmer("Halemo");
        programmingChannel.addSubscriber(programmer3);
        IObserver programmer4=new Programmer("Ezzat");
        programmingChannel.addSubscriber(programmer4);
        IObserver programmer5=new Programmer("Allam");
        programmingChannel.addSubscriber(programmer5);
        //make some of these programmer unsubscribe the Programming Channel.
        programmingChannel.removeSubscriber(programmer2);
        programmingChannel.removeSubscriber(programmer3);
    }

    public static void createDummySubscriberForFoodCooking(IObservable foodCookingChannel){
        IObserver chef1=new FoodCookingFans("chef1");
        foodCookingChannel.addSubscriber(chef1);
        IObserver chef2=new FoodCookingFans("chef2");
        foodCookingChannel.addSubscriber(chef2);
        IObserver chef3=new FoodCookingFans("chef3");
        foodCookingChannel.addSubscriber(chef3);
        IObserver chef4=new FoodCookingFans("chef4");
        foodCookingChannel.addSubscriber(chef4);
        IObserver chef5=new FoodCookingFans("chef5");
        foodCookingChannel.addSubscriber(chef5);
        //make some of these chives unsubscribe the FoodCookingFans Channel
        foodCookingChannel.removeSubscriber(chef5);
        foodCookingChannel.removeSubscriber(chef3);
        foodCookingChannel.removeSubscriber(chef1);
    }

    public static void main(String[] args) {
        //define sum Observable
        IObservable programmingChannel=new ProgrammingChannel();
        IObservable foodCookingChannel=new FoodCookingChannel();

        createDummySubscriberForProgramming(programmingChannel);
        createDummySubscriberForFoodCooking(foodCookingChannel);

        programmingChannel.notifySubscriber();
        System.out.println();
        System.out.println("==================================================");
        System.out.println();
        foodCookingChannel.notifySubscriber();

    }
}
