//import org.junit.Assert.assertEquals;
//import org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
//import org.junit
//import org.junit.Tests;
import MyInventory.*;
public class TestsJ {
    @Test
    public void test(){
        Inventory obj=new Inventory();
        obj.setInventory();
        Assert.assertEquals(2, 1+1);
        //test object creation
        Assert.assertNotNull(new Pizza("Deluxe Veggie","Regular",150,"Hand tossed",true));
        Crust c=obj.crustList.get(1);
        Assert.assertNotNull(new Pizza("Delux Veggie","Regular",150,c.getName(),true));
        
        Assert.assertEquals(true, PizzaWithToppings.validate(new Pizza("Delux Veggie","Regular",150,c.getName(),true),obj.toppingsList.get(1)));
    }
    
    
}
