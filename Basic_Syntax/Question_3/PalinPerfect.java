/*Ontefetse Ditsele
*  
* 06 July 2020
*/
import java.util.*;
import java.lang.Math.*;

class PalinPerfect{

   public static void main(String args[]){
      
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter a starting point N:");
        int start = input.nextInt();
        System.out.println("Enter a ending point M:");
        int M = input.nextInt();
        
        System.out.println("The palendromic perfects are as follows:");
        
        for (int N = start; N < M; N++){
            StringBuilder original = new StringBuilder(N); original.append(N);
            StringBuilder reversed = new StringBuilder(N); reversed.append(N);
            reversed.reverse();
            
            String O = new String(original);
            String R = new String(reversed);
            
            if (O.equals(R) && ( N % Math.sqrt(N) ==0)){
               System.out.println(N);
          
                                
            } 
        }
   }
}