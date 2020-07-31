/*Ontefetse Ditsele
 *
 *15 July 2020
*/

import java.util.*;

public class Question2{
   public static void main(String[] args){
      char ans;    String flavour;
      int itemnum; String size; String type;
      String base; String cheese; String garlic;
      
      Scanner input = new Scanner(System.in);
      List<MenuItem> OrderList = new ArrayList<>();
      
      System.out.println("Welcome to Great International Food Court");
      do{
         System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
         ans = input.next().charAt(0);
      
         switch (ans){
            case 'q': break; // Break out the switch-case to quit/
            case 'p':// Create a Pizza Item  
                  System.out.println("Enter the menu item number");
                  itemnum = input.nextInt();
                  
                  input.nextLine();
                  System.out.println("Enter the size");
                  size = input.nextLine();
                  
                  System.out.println("Enter the base");
                  base = input.nextLine();
                  
                  System.out.println("Enter extra cheese");
                  cheese = input.nextLine();
                  
                  System.out.println("Enter extra garlic");
                  garlic = input.nextLine();
                  
                  MenuItem pizza = new Pizza(itemnum,size,base,cheese,garlic);
                  OrderList.add(pizza); 
                  System.out.println("Done");
                  break;
            case 'c'://Create a Curry Item
                  System.out.println("Enter the menu item number");
                  itemnum = input.nextInt();
                  
                  input.nextLine();
                  System.out.println("Enter the size");
                  size = input.nextLine();
                  
                  System.out.println("Enter the curry type");
                  type = input.nextLine();

                  MenuItem curry = new Curry(itemnum,size,type);
                  OrderList.add(curry);
                  System.out.println("Done");
                  break;
            case 's'://Create a Soft Drink
                  System.out.println("Enter the menu item number");
                  itemnum = input.nextInt();
                  
                  input.nextLine();
                  System.out.println("Enter the size");
                  size = input.nextLine();
                  
                  System.out.println("Enter the flavour");
                  flavour = input.nextLine();
                  
                  System.out.println("Enter whether it is a bottle or can");
                  type = input.nextLine();
                  
                  MenuItem softDrink = new SoftDrink(itemnum,size,flavour,type);
                  OrderList.add(softDrink);                  
                  System.out.println("Done");
                  break;
            case 'd': // Delete Item from the list.
                  System.out.println("Enter the menu item number");
                  int num = input.nextInt();
                  OrderList.removeIf(Item ->(Item.getItemNumber() == num));
                  System.out.println("Done");
                  break;
            case 'l': //Display the Order in the Order List
                  for (MenuItem Order: OrderList){
                     System.out.println(Order);
                  }
                  break;
            default: 
                  System.out.println("Not found");
                  break;
         }
      
      }while(ans != 'q');
       
   
   }
}