/**
 * Auto Generated Java Class.
 */
public class HouseCat  extends Cat{
  
  private String type;
    
    public HouseCat ()
  {
    type="";
  }
  public HouseCat(String aType, String aMood, String aName, double aWeight)
  {
    super(aMood, aName, aWeight);
    this.setType(aType);
  }
  public String getType()
  {
    return this.type;
  }
  public boolean setType(String aType)
  {
    if(aType=="Short Hair"||aType=="Bombay"||aType=="Ragdoll"||aType=="Sphinx"||aType=="Scottish Fold")
    {
      this.type=aType;
      return true;
    }
    else{
      System.out.println("Invalid Type");
      return false;
    }
  }
  public boolean equals(HouseCat aHouseCat)
  {
    return aHouseCat!=null&&super.equals(aHouseCat)&&this.type.equals(aHouseCat.getType());
  }
  public String toString ()
  {
    return super.toString() + "Type:" + this.type; 
  }
    
  /* ADD YOUR CODE HERE */
  
}
