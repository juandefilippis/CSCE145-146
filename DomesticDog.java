/**
 * Auto Generated Java Class.
 */
public class DomesticDog extends Dog {
  
  private String type;
  
  public DomesticDog()
  { 
    super();
    type="";
  }
  public DomesticDog(String aType, int aEnergyLevel, String aName, double aWeight)
  {
   super(aEnergyLevel, aName, aWeight);
    this.setType(aType);
  }
  public String getType()
  {
    return this.type;
  }
  public boolean setType(String aType)
  { 
    if(aType=="Retriever"||aType=="Terrier"||aType=="Husky"||aType=="Yappy"||aType=="Mutt")
    {
    this.type=aType;
    return true;
  }
  else {
    System.out.println("Invilaid Type");
    return false;  
  }
  }
  public String toString ()    
  {
    return super.toString() + "Type:" + this.type;
  }
  public boolean equals(DomesticDog aDomesticDog)
  {
    return aDomesticDog!=null&&super.equals(aDomesticDog)&&this.type.equals(aDomesticDog.getType());
  }
}
  /* ADD YOUR CODE HERE */
  

