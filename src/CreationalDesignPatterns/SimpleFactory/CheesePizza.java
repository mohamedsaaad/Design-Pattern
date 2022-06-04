package CreationalDesignPatterns.SimpleFactory;

public class CheesePizza extends Pizza{
    public CheesePizza(){
        name="Cheese Pizza";
        dough="Regular Crust";
        sauce="Marinara sauce";
        topping.add("Fresh Mozzarella");
        topping.add("parmesan");
    }

}
