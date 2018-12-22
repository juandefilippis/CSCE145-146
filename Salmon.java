//Written by Juan De Filippis
public class Salmon extends ItemClass {
  
  
  private double price;
  
  public Salmon()
  {
   this.price = 0.0; 
  }
  
  public Salmon(String aName, int aQuantity, double aCost, double aPrice) 
  {
    super(aName,aQuantity,aCost);
    this.price=price;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  
  
}
