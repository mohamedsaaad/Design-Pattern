package CreationalDesignPatterns.FactoryMethod;

import CreationalDesignPatterns.SimpleFactory.CheesePizza;
import CreationalDesignPatterns.SimpleFactory.ClamPizza;
import CreationalDesignPatterns.SimpleFactory.PepperoniPizza;

import java.util.Random;

public class PizzaFactoryTwo implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        CreationalDesignPatterns.SimpleFactory.Pizza pizza=null;
        Random random=new Random();
        int r=random.nextInt(11);
        if(r==0)
            pizza=new CheesePizza();
        else if(r==1)
            pizza=new PepperoniPizza();
        else
            pizza=new ClamPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
