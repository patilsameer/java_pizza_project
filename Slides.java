public class Slides{
    private String name;
    private float price;
    private int stock;
    public Slides(){}
    public Slides(String name,float price, int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    public void setName(String name){
            this.name=name;
    }

    public float getPrice(){
        return price;
    }
    public void addStock(int stock){
        this.stock=this.stock+stock;
    }
    public boolean getStock(){
        if(this.stock>0){
            stock--;
            return true;
        }
        return false;
    }
    public void setPrice(float price){
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return name + " " + price;
    }
}