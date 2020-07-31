/*Ontefetse Ditsele
 *
 *03 July 2020
*/
import java.util.*;

class ImperialMetric{

   public static void main(String args[]){
         System.out.println("Enter the minumum number of feet(not less than 0):");
         Scanner input = new Scanner(System.in);
         int min = input.nextInt();
         
         System.out.println("Enter the maximum number of feet(not more than 30:)");
         int max = input.nextInt(); max++;
         
         System.out.print("      |  0\"     1\"     2\"     3\"     4\"     5\"     6\"     7\"     8\"     9\"     10\"     11\" ");
         for (int feet = min; feet < max; feet++){
               System.out.format("%n%4d' |",feet);
               for (int inches = 0; inches < 12;inches++){
                  double metres = (feet*12+inches)*0.0254; 
                 
                 System.out.format(" %.3f ",metres);
               }         
         }
         
   
   
   }
}