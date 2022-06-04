package CreationalDesignPatterns.FactoryMethod;
import CreationalDesignPatterns.FactoryMethod.Pizza;

public class CustmerSimulate {
    public static void main(String[] args) {
        Pizza pizza=null;
        PizzaFactory pizzaFactory=null;
        String factory="random";
        if(factory.equals("random")){
            pizza=new PizzaFactoryRandom("cheese").createPizza();
        }else if (factory.equals("one")){
            pizza= (CreationalDesignPatterns.SimpleFactory.Pizza) new PizzaFactoryOne().createPizza();
        }else if (factory.equals("two")) {
            pizza = new PizzaFactoryTwo().createPizza();
        }
    }
}
