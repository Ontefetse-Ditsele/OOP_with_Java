/*Ontefetse Ditsele
 *
 *15 July 2020
 *
*/

public class SoftDrink extends MenuItem{
   private String flavour;
   private String type;
      
   SoftDrink(int number,String size,String flavour,String type){
      super(number,size);
      this.flavour = flavour;
      this.type    = type;
   }
   
   public String toString(){
      return "Soft Drink: " + super.toString() + ", " + this.flavour + ", " + this.type;
   }
}