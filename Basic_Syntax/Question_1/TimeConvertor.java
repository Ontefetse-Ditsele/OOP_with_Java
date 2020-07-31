/*Ontefetse Ditsele
/
/01 July 2020
*/


import java.util.*;

class TimeConvertor{
   
   public static void main(String args[]){
   
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a time: [h]h:mm [am][pm]");
      String original = input.nextLine();
      String[] Time = original.split(":");
      
      int hours = Integer.parseInt(Time[0]);
      String minutes;
      String suffix = Time[1];
      
           
      //Convert to 24 hours
      if (suffix.endsWith("m")){
      
         String[] suffix2 = suffix.split(" ");
         minutes = suffix2[0];  
         
         if(suffix2[1].endsWith("pm")){
         
            hours += 12; 
           System.out.println(hours+":"+minutes);
         }
         
         else{ 
            if (hours < 10){
               System.out.println("0"+hours+":"+minutes);}
            else if (hours == 12){
               System.out.println("00:"+minutes);}
            else{
               System.out.println(hours+":"+minutes);}   
         }
      }
      //Converts to 12 hours
      else{
        minutes = Time[1];
        
           if (hours < 12 && hours != 0){
             System.out.println(hours+":"+minutes +" am");
           }
           else if (hours == 0){
               System.out.println("12:"+minutes +" am");
           }
           else{
              hours -= 12;
              System.out.println(hours+":"+minutes+" pm");
           }
      }
 }      
}   