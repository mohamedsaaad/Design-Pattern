package CreationalDesignPatterns.FactoryMethod;

public class ClamPizza extends Pizza {
    public ClamPizza(){
        name="Clam Pizza";
        dough="Thin Crust";
        sauce="White Garlic sauce";
        topping.add("Clam");
        topping.add("Grated parmesan cheese");
    }
}
