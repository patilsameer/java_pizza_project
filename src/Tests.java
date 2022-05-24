import MyInventory.*;
public class Tests{
    public static void main(String[] args){
        Inventory obj=new Inventory();
        obj.setInventory();

        //testing pizza class
        Pizza first=new Pizza("Deluxe Veggie","Regular",150,"Hand tossed",true);
        System.out.println(first);
       
        //testing selection of crust
        Crust c=obj.crustList.get(1);
        Pizza second=new Pizza("Delux Veggie","Regular",150,c.getName(),true);
        System.out.println(second);

        //veg pizza shall get veg toppings only
        boolean test=PizzaWithToppings.validate(second,obj.toppingsList.get(1));
        PizzaWithToppings pwt=null;
        if(test){
            System.out.println(second.toString()+" "+obj.toppingsList.get(1).toString());
            System.out.println("Total Price="+(second.getPrice()+obj.toppingsList.get(1).getPrice()));
            pwt=new PizzaWithToppings(second,obj.toppingsList.get(1));
        }
        //stock not available
        c=obj.crustList.get(3);
        if(c.getCrust()){
                Pizza third=new Pizza(c.getName(),"Regular",150,obj.toppingsList.get(1).toString(),true);
        }
        else{
            System.out.println("out of Stock");
        }
        Slides s1=obj.slidsList.get(0);
        Slides orderslide=new Slides();
        orderslide.setName(s1.getName());
        orderslide.setPrice(s1.getPrice());        
        // order class Test
        System.out.println("Final Order");
        Order o1=new Order();
        o1.addPizza(first);
        o1.addPizzaWithToppings(pwt);
        o1.addSlide(orderslide);

        System.out.println(o1);
        System.out.println("Total Price of order="+o1.getPrice());

        //TestsJ obj1=new TestsJ();
        //obj1.test();
 
    }
}