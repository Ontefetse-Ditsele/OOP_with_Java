/* Ontefetse Ditsele
 *
 *22 July 2020
*/

import java.util.*;

public class Question1{
   
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      List<SoftDrink> order = new ArrayList<SoftDrink>();
      int ans; String drink; String[] drink_items;int vol;
      
      do{
         System.out.println("Enter option: (1) add Soft Drink (2) quit:");
         ans = input.nextInt();
         if (ans== 2) break;
         
         input.nextLine();
         System.out.println("Enter name, colour and volume in ml separated by space");
         drink = input.nextLine();
         drink_items = drink.split(" ");
         vol         = Integer.parseInt(drink_items[2]);
         order.add(new SoftDrink(drink_items[0],drink_items[1],vol));
      
      }while(ans !=2);
         
      Collections.sort(order);
      for (SoftDrink item : order){  System.out.println(item); }
   }
}