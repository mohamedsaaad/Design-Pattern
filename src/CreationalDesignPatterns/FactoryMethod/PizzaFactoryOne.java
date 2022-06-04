package CreationalDesignPatterns.FactoryMethod;

import CreationalDesignPatterns.SimpleFactory.CheesePizza;
import CreationalDesignPatterns.SimpleFactory.PepperoniPizza;
import CreationalDesignPatterns.SimpleFactory.VeggiePizza;

import java.util.Random;

public class PizzaFactoryOne  implements PizzaFactory{
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
            pizza=new VeggiePizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
