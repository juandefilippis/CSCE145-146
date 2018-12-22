/**
 * Auto Generated Java Class.
 */
public class SawLine implements Line{
  
  private double moodValue;
  
  public SawLine()
  {
    moodValue=0.0;
  }
  public SawLine(double aMoodValue)
  {
    this.setMoodValue(aMoodValue);
  }
  public double getMoodValue()
  {
    return this.moodValue;
  }
  public void setMoodValue ( double aMoodValue)
  {
    this.moodValue=aMoodValue;
  }
  public double getYPoint(double x)
  {
    return x% moodValue;
    
  }
    
  
  /* ADD YOUR CODE HERE */
  
}
