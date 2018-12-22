/**
 * Auto Generated Java Class.
 */
public class RPSPlayer implements RPSPlayerInterface {
  private String gesture;
  private int points;
  
  public RPSPlayer()
  {
    gesture="None";
    points=0;
  }
  public RPSPlayer(String aGesture, int aPoints)
  {
    this.setGesture(aGesture);
    this.setPoints(aPoints);
  }
  public String getGesture()
  {
    return this.gesture;   
  }
  public int getPoints()
  {
    return this.points;
  }
  public void setGesture(String aGesture)
  {
   
      this.gesture=aGesture;
  
    
  }
  public void setPoints (int aPoints)
  {
    this.points=aPoints;
  }
  public void chooseGesture()
  {
    this.gesture="none";
  }
  
  /* ADD YOUR CODE HERE */
  
}
