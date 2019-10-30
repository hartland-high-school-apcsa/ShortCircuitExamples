// short-circuited evaluation: demonstration in class by Mr. Burton. The property of the logical operators && and || 
//that prevents the second operand from being evaluated if the overall result is obvious from the value of 
//the first operand.
public class ShortCircuit {
   public static void main(String[] args){
      System.out.println( "\n T || T " );
      if( retTrue() || retTrue() ){
      }
  
      System.out.println( "\n T || F " );
      if( retTrue() || retFalse() ){
      }

      System.out.println( "\n F || T " );      
      if( retFalse() || retTrue() ){
      }
      
      System.out.println( "\n F || F " );
      if( retFalse() || retFalse() ){
      }


      System.out.println( "\n T && T " );
      if( retTrue() && retTrue() ){
      }
  
      System.out.println( "\n T && F " );
      if( retTrue() && retFalse() ){
      }

      System.out.println( "\n F && T " );      
      if( retFalse() && retTrue() ){
      }
      
      System.out.println( "\n F && F " );
      if( retFalse() && retFalse() ){
      }


   }
   
   public static boolean retTrue(){
      System.out.println("running retTrue");
      return true;
   }
   
   public static boolean retFalse(){
      System.out.println("running retFalse");
      return false;
   }
      
}