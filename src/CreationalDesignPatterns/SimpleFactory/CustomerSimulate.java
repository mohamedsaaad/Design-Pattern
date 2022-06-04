package CreationalDesignPatterns.SimpleFactory;

public class CustomerSimulate {
    public static void main(String[] args) {
        PizzaStore order=new PizzaStore();
        Pizza pizza=order.orderPizza("Pepperoni");
        System.out.println(pizza.toString());

    }

}

