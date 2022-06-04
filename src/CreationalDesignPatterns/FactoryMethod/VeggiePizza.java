package CreationalDesignPatterns.FactoryMethod;

public class VeggiePizza extends Pizza {
    public VeggiePizza(){
        name="Veggie Pizza";
        dough="Crust";
        sauce="Marinara sauce";
        topping.add("Shredded Mozzarella");
        topping.add("Grated parmesan");
        topping.add("Diced onion");
        topping.add("Sliced Mushrooms");
        topping.add("Sliced Red Pepper");
        topping.add("Sliced Black olives");
    }
}

