package CreationalDesignPatterns.FactoryMethod;

import CreationalDesignPatterns.SimpleFactory.CheesePizza;
import CreationalDesignPatterns.SimpleFactory.ClamPizza;
import CreationalDesignPatterns.SimpleFactory.PepperoniPizza;
import CreationalDesignPatterns.SimpleFactory.Pizza;
import CreationalDesignPatterns.SimpleFactory.VeggiePizza;

public class PizzaFactoryRandom implements PizzaFactory{
    private String type;

    public PizzaFactoryRandom(String type){
        this.type=type;
    }
    @Override
    public Pizza createPizza() {
        Pizza pizza=null;
        switch(this.type){
            case "Pepperoni":
                pizza=new PepperoniPizza();
                break;
            case "Cheese":
                pizza=new CheesePizza();
                break;
            case "Calm":
                pizza=new ClamPizza();
                break;
            case "Veggie":
                pizza=new VeggiePizza();
                break;
            default:
                System.out.println("please enter valid type !");
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
