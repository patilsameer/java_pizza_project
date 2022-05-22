public class PizzaWithToppings{
    public Pizza pizza;
    public Toppings toppings;
    public PizzaWithToppings(){}
    public PizzaWithToppings(Pizza pizza,Toppings toppings){
            this.pizza=pizza;
            this.toppings=toppings;

    }
    public String toString(){
        float price=pizza.getPrice() + toppings.getPrice();
        return pizza.getName()+" "+toppings.getName()+" "+price;
    }
    public float getPrice(){
        return pizza.getPrice() + toppings.getPrice();
    }
    //veg pizza can have only veg toppings -visa versa
    public static boolean validate(Pizza pizza,Toppings toppings)  
    {
        if((pizza.isVeg() && toppings.isVeg()) || (!pizza.isVeg()&& !toppings.isVeg()))
            return true;
        return false;
    }
}