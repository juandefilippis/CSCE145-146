//Written by Juan De Filippis
public class Napkins extends ItemClass {
  private double price;
  
  public Napkins()
  {
   this.price = 0.0; 
  }
  
  public Napkins(String aName, int aQuantity, double aCost, double aPrice) 
  {
    super(aName, aQuantity,aCost);
    this.price= aPrice;
  }
  public double getPrice()
  {
    return price;
  }
  public void setPrice(double aPrice)
  {
    this.price = aPrice;
  }
  
  
}
