public class Tests{
    public static void main(String[] args){
        Inventory obj=new Inventory();
        obj.setInventory();

        //testing pizza class
        Pizza first=new Pizza("Deluxe Veggie","Regular",150,"Hand tossed",true);
        System.out.println(first.toString());
       
        //testing selection of crust
        Crust c=obj.crustList.get(1);
        Pizza second=new Pizza("Delux Veggie","Regular",150,c.getName(),true);
        System.out.println(second.toString());

        //veg pizza shall get veg toppings only
        boolean test=PizzaWithToppings.validate(second,obj.toppingsList.get(1));
        if(test){
            System.out.println(second.toString()+" "+obj.toppingsList.get(1).toString());
            System.out.println("Total Price="+(second.getPrice()+obj.toppingsList.get(1).getPrice()));
        }
        //stock not available
        c=obj.crustList.get(3);
        if(c.getCrust()){
                Pizza third=new Pizza(c.getName(),"Regular",150,obj.toppingsList.get(1).toString(),true);
        }
        else{
            System.out.println("out of Stock");
        }
        //PizzaWithToppings(first,)    
    }
}