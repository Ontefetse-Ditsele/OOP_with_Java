/*Ontefetse Ditsele
 *
 *14 July 2020
 * Menu item to be the base of all the menu foods and drinks
*/

public class MenuItem{
   private int itemNumber;
   private String size;
   
   MenuItem(int Number,String size){
      this.itemNumber = Number;
      this.size       = size;
   }
   

   public String toString(){
      return this.itemNumber +", "+ this.size;
   }
   
   public int getItemNumber(){
      return this.itemNumber;
   }
}