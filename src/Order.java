import java.util.*;
import MyInventory.*;
public class Order{

    private ArrayList<Pizza> pizzaList=null;
    private ArrayList<PizzaWithToppings> pizzaWithToppingsList=null;
    private ArrayList<Sides> sidesList=null;
    
    public Order(){
        pizzaList=new ArrayList();
          pizzaWithToppingsList=new ArrayList();
          sidesList=new ArrayList();
    }
    public void addPizza(Pizza pizza){
        pizzaList.add(pizza);
    }
    public void addPizzaWithToppings(PizzaWithToppings pizzaWithToppings){
        pizzaWithToppingsList.add(pizzaWithToppings);
    }
    public void addSide(Sides sides){
        sidesList.add(sides);
    }

    public float getPrice(){
        float totalorder=0.0f;
        for(Pizza p:pizzaList){
            totalorder=totalorder+p.getPrice();
        }

        for(PizzaWithToppings p:pizzaWithToppingsList){
            totalorder=totalorder+p.getPrice();
        }

        for(Sides p:sidesList){
            totalorder=totalorder+p.getPrice();;
        }
        return totalorder;
    }

    public String toString(){
        String totalorder="";
        for(Pizza p:pizzaList){
            totalorder=totalorder+" "+p+"\n";
        }

        for(PizzaWithToppings p:pizzaWithToppingsList){
            totalorder=totalorder+" "+p.toString()+"\n";
        }

        for(Sides p:sidesList){
            totalorder=totalorder+" "+p.toString()+"\n";
        }
        return totalorder;
    }
}