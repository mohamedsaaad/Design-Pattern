package CreationalDesignPatterns.AbstractFactoryMethod;

public class WindowsAlert  extends Alert{
    @Override
    public void print() {
        System.out.println("hi from Windos Alert !");
    }
}
