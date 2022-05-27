package MyInventory;

import java.util.*;
public class Inventory{
    public void setInventory(){
      
        crustList=new ArrayList();
        toppingsList=new ArrayList();

        Crust c1=new Crust("Hand tossed",3);// parameter- name & quantity available
        crustList.add(c1);
        Crust c2=new Crust("Chese Burst",3);
        crustList.add(c2);
        Crust c3=new Crust("Wheat thin",3);
        crustList.add(c3);
        Crust c4=new Crust("Fresh pan pizza",0);
        crustList.add(c4);

        Toppings t1=new Toppings("Black olive",true,2,20);// parameter- name,veg,stock,price
        toppingsList.add(t1);
        Toppings t2=new Toppings("Capsicum",true,2,25);
        toppingsList.add(t2);
        Toppings t3=new Toppings("Paneer",true,2,35);
        toppingsList.add(t3);
        Toppings t4=new Toppings("Mushroom",true,2,30);
        toppingsList.add(t4);
        Toppings t5=new Toppings("Chicken Tikka",false,2,35);// parameter- name,Nonveg,stock,price
        toppingsList.add(t5);
        Toppings t6=new Toppings("Barbeque chicken",false,2,45);
        toppingsList.add(t6);
        Toppings t7=new Toppings("Grilled chicken",false,2,40);
        toppingsList.add(t7);
        Toppings t8=new Toppings("Fresh Tomato",true,2,10);
        toppingsList.add(t8);

        Sides s1=new Sides("Cold Dring",20,5);
        sidesList=new ArrayList();
        sidesList.add(s1);
    }

    public static ArrayList<Crust> crustList=null;
    public static ArrayList<Toppings> toppingsList=null;
    public static ArrayList<Sides> sidesList=null;
}