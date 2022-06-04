package CreationalDesignPatterns.SimpleFactory;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza() {
        name="Pepperoni Pizza";
        dough="Crust";
        sauce="Marinara sauce";
        topping.add("Sliced Pepperoni");
        topping.add("Sliced onion");
        topping.add("Grated parmesan cheese");
    }
}
