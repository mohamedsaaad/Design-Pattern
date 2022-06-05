package CreationalDesignPatterns.AbstractFactoryMethod;

public class IOSNButton  extends NButton{
    @Override
    public void print() {
        System.out.println("hi its IOS Button");
    }
}
