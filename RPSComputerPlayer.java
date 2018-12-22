/**
 * Auto Generated Java Class.
 */
import java.util.Random;
public class RPSComputerPlayer extends RPSPlayer {
  private Random rand;
  
  public RPSComputerPlayer ()
  {
    super();
    rand = new Random();
  }
  public void chooseGesture ()
  {
    int ranGesture = rand.nextInt(3);
    if(ranGesture == 0){
      this.setGesture("rock");
    }
    else if(ranGesture ==1)
    {
      this.setGesture("papers");
    }
    else if(ranGesture ==2)
    {
      this.setGesture("scissors");
    }
      
  }
}
  
  /* ADD YOUR CODE HERE */
  

