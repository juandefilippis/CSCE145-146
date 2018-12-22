//Written by Juan De Filippis
public class ItemClass {
  
  private String name;
  private int quantity;
  private double cost;
  
  public ItemClass() 
  {
    this.name = "";
    this.quantity = 0;
    this.cost = 0.0;  
   
  }
  public ItemClass(String aName, int aQuantity, double aCost)
  {
    this.name = aName;
    this.quantity = aQuantity;
    this.cost = aCost;
  }
  public void setName(String newName) {
    this.name = newName;  
  }
  public void setQuantity(int newQuantity) {
    this.quantity = newQuantity;
  }
  public void setCost(double newCost) {
    this.cost = newCost;
  }
  public String getName() {
    return this.name;
  }
  public int getQuantity() {
    return this.quantity;
  }
  public double getCost() {
    return this.cost;
  }
  public double totalCost()
  {
    return this.cost*quantity;
  }
  
  public String toString() {
    return "Name:"+ this.name + "Quantity:" + this.quantity + "Cost:" + this.cost;
  }

  
}
