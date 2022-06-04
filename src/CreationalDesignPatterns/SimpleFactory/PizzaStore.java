package CreationalDesignPatterns.SimpleFactory;

import java.util.Random;

public class PizzaStore {

   public Pizza orderPizza(String type){
        Pizza pizza=null;
        switch(type){
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

    public Pizza getRandomPizza1(){
       Pizza pizza=null;
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
    public Pizza getRandomPizza2(){
        Pizza pizza=null;
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
