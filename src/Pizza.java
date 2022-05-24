public class Pizza{
  private String name;
  private String size;
  private float  price;
  private String crust;
  private boolean vegOrNonVeg;//true =veg;

  public Pizza(String name,String size,float price,String crust,boolean vegOrNonVeg){
      this.name=name;
      this.size=size;
      this.price=price;
      this.crust=crust;
      this.vegOrNonVeg=vegOrNonVeg;
  
  } 

  public void setPrice(float price){
      this.price=price;
  }
  public float getPrice()
  {
      return price;
  }
  public String getName()
  {
      return this.name;
  }
  public boolean isVeg()
  {
      return vegOrNonVeg;
  }
  public String toString(){
      return  name + " " + size +" "+price+" "+crust;
  }
}