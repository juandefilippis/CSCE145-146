/**
 * Auto Generated Java Class.
 */
public class Cat extends Animal {
  
  private String mood;
  
  public Cat() 
  {
    super();
    mood="";
  }
  public Cat (String aMood, String aName, double aWeight)
  {
    super(aName, aWeight);
    this.setMood(aMood);
  }
  public String getMood ()
  {
    return this.mood;
  }
  public boolean setMood(String aMood)
  {
    if(aMood == "Sleepy"||aMood=="Playful"||aMood=="hungry")
    { 
         this.mood=aMood;
         return true;
    }
    else 
    {
      System.out.println("Invalid Mood");
      return false;
  }
  }
   public boolean equals (Cat aCat)
  {
    return aCat !=null&&super.equals(aCat)&&this.mood.equals(aCat.getMood());
  } 
  public String toString()
  {
    return super.toString() +"Cat Mood:" + this.mood;
  } 
    
  
  /* ADD YOUR CODE HERE */
  
}
