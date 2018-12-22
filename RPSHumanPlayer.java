/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class RPSHumanPlayer extends RPSPlayer {
 
  private Scanner kb;
  
  
  public RPSHumanPlayer()
  {
    super();
    kb= new Scanner(System.in);
  }
  public void chooseGesture()
  {
    String ans = kb.nextLine();
    super.setGesture(ans);
  }
  
  /* ADD YOUR CODE HERE */
  
}
