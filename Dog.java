/**
 * Auto Generated Java Class.
 */
public class Dog extends Animal{
  
  private int energyLevel;
  
  public Dog()
  {
    super();
    energyLevel=0;
  }
  public Dog(int aEnergyLevel, String aName, double aWeight)
  {
    super(aName,aWeight);
    this.setEnergyLevel(aEnergyLevel);
  }
  public int getEnergyLevel()
  {
    return this.energyLevel;
  }
  public boolean setEnergyLevel (int aEnergyLevel)
  {
    if(aEnergyLevel >= 0 && aEnergyLevel <=100)
    {
    this.energyLevel= aEnergyLevel;
    return true;
  }
    else{
      System.out.println("Invalid Energy Level");
      return false;
    }
  }
   public boolean equals (Dog aDog)
  {
    return aDog !=null&&super.equals(aDog)&&this.energyLevel==aDog.getEnergyLevel();
  }
  public String toString()
  {
    return super.toString() + "Dogs Energy Level:" + this.energyLevel; 
  }
    
  /* ADD YOUR CODE HERE */
  
}
