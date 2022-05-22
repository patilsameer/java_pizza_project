package MyInventory;

public class Toppings{
    private String name;
    private boolean vegOrNonVeg;//true=veg;
    private int stock;
    private float price;

    public Toppings(String name,boolean type,int stock,int price){
        this.name=name;
        this.vegOrNonVeg=type;
        this.stock=stock;
        this.price=price;
    }

    public String getName(){
        return name;

    }

    public void setPrice(float price){
        this.price=price;
    }
    public float getPrice(){
        return price;
    }
    public boolean isVeg()
    {
        return vegOrNonVeg;
    }
    public void addStock(int stock){
        this.stock=this.stock+stock;
    }
    public boolean getTopping()
    {
        if(this.stock>0){
            this.stock--;
            return true;
        }
            return false;
    }

    public String toString(){
        return name;
    }
}