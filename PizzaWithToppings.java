public class PizzaWithToppings{

    //veg pizza can have only veg toppings -visa versa
    public static boolean validate(Pizza pizza,Toppings toppings)  
    {
        if((pizza.isVeg() && toppings.isVeg()) || (!pizza.isVeg()&& !toppings.isVeg()))
            return true;
        return false;
    }
}