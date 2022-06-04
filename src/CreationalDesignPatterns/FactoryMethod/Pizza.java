package CreationalDesignPatterns.FactoryMethod;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> topping=new ArrayList<>();

    // methods
    public String getName(){
        return name;
    }

    public void prepare(){
        System.out.println("preparing "+name);
    }

    public void bake(){
        System.out.println("Baking "+name);
    }

    public void cut(){
        System.out.println("cutting "+name);
    }

    public void box(){
        System.out.println("Boxing "+name);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", souce='" + sauce + '\'' +
                ", topping=" + topping +
                '}';
    }
}
