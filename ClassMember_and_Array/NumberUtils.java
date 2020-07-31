/*Ontefetse Ditsele
 *
 *19 July 2020
*/
//package ut.number;

import java.util.*;

public class NumberUtils{
    
    public static int[] result;  
    public static int count;
    public static int[] ArrayOne;
    public static int[] ArrayTwo;
     
    private NumberUtils(){}
    
    public static int[] toArray(int number){
      int length = Integer.toString(number).length(); 
      int index = 0;
      result = new int[length];
      
      while(number != 0){
            result[length-index-1] = number%10;
            number /= 10;
            index++;
         }
       return result;
    }
      
    public static int countMatches(int numberA,int numberB){
            count = 0;
            ArrayOne = toArray(numberA);
            ArrayTwo = toArray(numberB);
            
            for(int i = 0; i< ArrayOne.length ;i++){
               if(ArrayOne[i] == ArrayTwo[i]) 
                   count++;
            }
            return count;
      }
      public static int countintersect(int numberA,int numberB){
            count = 0;
            ArrayOne = toArray(numberA);
            ArrayTwo = toArray(numberB);
            
           for(int index = 0; index < ArrayOne.length;index++){
              
              for(int index_2 = 0; index_2 < ArrayTwo.length; index_2++){
                  
                  if(ArrayOne[index] == ArrayTwo[index_2]){
                     count++;
                  }
               }
            }
            return count;
      }  
      
}