/*Ontefetse Ditsele
 *
 *15 July 2020
 *
*/


public class Pizza extends MenuItem{
   
   private String base;
   private String xCheese;
   private String xGarlic;
   
   Pizza(int number,String size,String base,String cheese,String garlic){
      super(number,size);
      this.base    = base;
      this.xCheese = cheese;
      this.xGarlic = garlic;
   }
   
   public String toString(){
      return "Pizza: "+ super.toString() + ", " + this.xCheese +", "+ this.xGarlic;
   }
}