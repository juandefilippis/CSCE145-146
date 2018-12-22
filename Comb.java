//Written by Juan De Filippis
public class Comb extends ItemClass {
  private double price;
  
  public Comb()
  {
   this.price = 100.0; 
  }
  
  public Comb(String aName, int aQuantity, double aCost, double aPrice) 
  {
    super(aName,aQuantity,aCost);
    this.price=aPrice;
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