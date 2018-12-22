/**
 * Written by Juan De Filippis
 */
  import java.util.Scanner;
  import java.util.Random;
  
public class Homework4 {
  public static void main (String [] args) {
    
   System.out.println("Welcome to rock paper scissors. Best 2 out of 3!");
    int count=0;
    Scanner keyboard= new Scanner(System.in);
    Random r = new Random();
     int computerScore=0;
     int playerScore=0;
    int playAgain=0;
     
     
    while (playAgain==0) 
    {
    while (count < 3)
    {
    System.out.println("enter \"rock\" \"paper\" or \"scissors\"");
    
    String input = keyboard.nextLine();
    
    int output = r.nextInt(3);
    if (output==0)
    { System.out.println(input+" versus rock");
      
      if (input.equalsIgnoreCase("scissors"))
      {computerScore++;
        System.out.println("player win "+playerScore+" Computer win "+computerScore);
      }
      else if (input.equalsIgnoreCase("paper"))
      { playerScore++;
     System.out.println("player wins "+playerScore+" Computer wins "+computerScore); } 
        else 
        { computerScore++;
        System.out.println("player wins "+playerScore+" Computer wins "+computerScore);}
    }
      else if (output==1)
      { System.out.println(input+" versus paper");
      
        if (input.equalsIgnoreCase("rock"))
      { computerScore++;
      System.out.println("player wins "+playerScore+" Computer wins "+computerScore);}
      else if (input.equalsIgnoreCase("scissors"))
      { playerScore++;
      System.out.println("player wins "+playerScore+" Computer wins "+computerScore);}
      else
      { computerScore++;
      System.out.println("player wins "+playerScore+" Computer wins "+computerScore);}
      
      }
      
      else if (output==2)
      { System.out.println(input+" versus scissors");
      
        if (input.equalsIgnoreCase("paper"))
      { computerScore++;
      System.out.println("player wins "+playerScore+" Computer wins "+computerScore);}
      else if(input.equalsIgnoreCase("rock"))
      { playerScore++;
      System.out.println("player wins "+playerScore+" Computer wins "+computerScore);}
        else
        { computerScore++;
        System.out.println("player wins "+playerScore+" Computer wins "+computerScore);}
        
      }
      
    
    
    
    count++;
  
  
    }
    
    System.out.println("Player Score = "+ playerScore);    
    System.out.println("Computer Score = "+ computerScore);
    
    if (computerScore>playerScore)
    { System.out.println("Computer wins");
    }
    else 
    {System.out.println("Player wins!");
    }
   System.out.println("play again? \"yes\" \"or\" \"no\" ");
   String answer= keyboard.nextLine();
   if (answer.equalsIgnoreCase("yes"))
   { count=0;
     playerScore=0;
       computerScore=0;
   }
    else 
    {playAgain++;
    System.out.println("goodbye");}
    }
    
    System.exit(0);
  

    
  }
  
  /* ADD YOUR CODE HERE */
  
}
