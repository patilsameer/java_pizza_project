//import org.junit.Assert.assertEquals;
//import org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
//import org.junit
//import org.junit.Tests;

public class TestsJ {
    @Test
    public void test(){
        Assert.assertEquals(2, 1+1);
        //test object creation
        Assert.assertNotNull(new Pizza("Deluxe Veggie","Regular",150,"Hand tossed",true));
    }    
}
