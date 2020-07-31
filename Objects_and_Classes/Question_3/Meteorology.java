/*Ontefetse Ditsele
 *
 *10 July 2020
*/
import java.util.Scanner;

class Meteorology{
  
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);     
      Collator Temperature = new Collator("temperature");
      Collator Pressure = new Collator("pressure");
      Collator Humidity = new Collator("humidity");
      
      Collator[] collators = {Temperature,Pressure,Humidity};
      
      System.out.println("Meteorology Pogram");
      menu();
      int ans = input.nextInt();
      
      while(ans != 7){
            switch (ans){
               case 1:
                  System.out.println("Enter a value:");
                  Temperature.recordReading(input.nextInt());
                  break;
               case 2:
                  System.out.println("Enter a value:");
                  Pressure.recordReading(input.nextInt());               
                  break;
               case 3:
                  System.out.println("Enter a value:");
                  Humidity.recordReading(input.nextInt());
                  break;                  
               case 4:
                   for(Collator name : collators){ 
                     int val = name.maximum();
                     if (val == 0){
                        System.out.println("Maximum "+name.label()+": -");
                     }
                     else{
                        System.out.println("Maximum "+name.label()+": "+ val);
                     }
                  }
                  break;
               case 5:
                   for(Collator name : collators){ 
                     int val = name.minimum();
                     if (val == 0){
                        System.out.println("Minimum "+name.label()+": -");
                     }
                     else{
                        System.out.println("Minimum "+name.label()+": "+ val);
                     }
                  }
                  break;
                  
               case 6:
                   for(Collator name : collators){ 
                     double val = name.average();
                     if (val == 0){
                        System.out.println("Average "+name.label()+": -");
                     }
                     else{
                        System.out.printf("Average "+name.label()+": %.2f%n", val);
                     }
                  }
                  break;
            }
            menu();
            ans = input.nextInt();   
      }
      
   }
   static void menu(){
      System.out.println("Make a selection and press return:");
      System.out.println("1. Record a temperature reading.");
      System.out.println("2. Record a pressure reading.");
      System.out.println("3. Record a humidity reading.");
      System.out.println("4. Print maximum values."); 
      System.out.println("5. Print minimum values.");
      System.out.println("6. Print average values.");  
      System.out.println("7. Quit.");
   }
}