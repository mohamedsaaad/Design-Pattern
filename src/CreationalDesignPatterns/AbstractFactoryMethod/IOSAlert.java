package CreationalDesignPatterns.AbstractFactoryMethod;

public class IOSAlert extends Alert {
    @Override
    public void print() {
        System.out.println("hi from IOS Alert !");
    }
}
