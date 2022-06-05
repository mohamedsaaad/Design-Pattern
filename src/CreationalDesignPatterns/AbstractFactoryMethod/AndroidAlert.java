package CreationalDesignPatterns.AbstractFactoryMethod;

public class AndroidAlert extends Alert {
    @Override
    public void print() {
        System.out.println("hi from Android Alert !");
    }
}
