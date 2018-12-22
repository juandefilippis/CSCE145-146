/**
 * Written by Juan De Filippis
 */
public class Animal {
  
  private String name;
  private double weight;
  
  public Animal (){
    
    name="";
    weight=0.0;
  }
  
  public Animal (String aName, double aWeight)
  {
    this.setName(aName);
    this.setWeight(aWeight);
  }
  public String getname()
  {
    return this.name;
  }
  public double getweight()
  {
    return this.weight;
    }
  public void setName(String aName)
  {
    this.name = aName;
  }
    public void setWeight(double aWeight)
    {
      if(aWeight >0.0)
      {
        this.weight = aWeight;
      }
      else{
        System.out.println("Weight has te be greater than 0");
      }
    }
    public boolean equals (Animal aAnimal)
    {
      return aAnimal!=null&&this.name.equals(aAnimal.getname())&&this.weight==aAnimal.getweight();
    }
    public String toString()
    {
      return "Name:" + this.name + "Weight:" + this.weight;
    }
  /* ADD YOUR CODE HERE */
  
}
