public class Crust{
    private String name;
    private int stock;

    public Crust(String name,int stock){
        this.name=name;
        this.stock=stock;
    }

    public String getName(){
        return name;
    }
    public boolean getCrust(){
        if(stock>0){
            stock--;
            return true;
        }
        return false;
    }

    public void setCrust(int new_stock){
        stock=stock+new_stock;
    }
}