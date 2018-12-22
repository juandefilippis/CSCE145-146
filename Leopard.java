/** 
 * Auto Generated Java Class. 
 */ 
public class Leopard 
extends Cat{ 
   
    private int  Spots; 
    
    public Leopard()
    { 
    super(); 
    this.Spots = 0; 
    } 
     
     public Leopard(int aSpots, String aMood,String aName, double aWeight)
     {  
     super(aMood, aName, aWeight); 
     this.setSpots(aSpots); 
     } 
      
      public int getSpots() 
      { 
     
      return this.Spots; 
      } 
       
       public void setSpots(int aSpots) { 
         
        if(aSpots>=0){ 
          this.Spots = aSpots;  
        } 
        else{ 
          System.out.println("Spots have to be greater than 0"); 
        } 
 
        } 
        
        public String toString() 
        { 
          
         return super.toString() + "nSpots:" + this.Spots; 
           
       } 
         
         public boolean equals(Leopard aLeopard) 
       { 
        
       return aLeopard != null&&super.equals(aLeopard)&&this.Spots==aLeopard.getSpots(); 
 
        } 
   
 
   
} 

    
    
    
    
  /* ADD YOUR CODE HERE */
  

