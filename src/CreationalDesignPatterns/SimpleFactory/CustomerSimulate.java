package CreationalDesignPatterns.SimpleFactory;

import CreationalDesignPatterns.FactoryMethod.PizzaFactory;
import CreationalDesignPatterns.FactoryMethod.PizzaFactoryOne;
import CreationalDesignPatterns.FactoryMethod.PizzaFactoryRandom;
import CreationalDesignPatterns.FactoryMethod.PizzaFactoryTwo;

public class CustomerSimulate1 {
    public static void main(String[] args) {
        Pizza pizza=null;
        PizzaFactory pizzaFactory=null;
        String factory="random";
        if(factory.equals("random")){
            pizza=new PizzaFactoryRandom("cheese").createPizza();
        }else if (factory.equals("one")){
            pizza= (Pizza) new PizzaFactoryOne().createPizza();
        }else if (factory.equals("two")) {
            pizza = (Pizza) new PizzaFactoryTwo().createPizza();
        }

    }

}

