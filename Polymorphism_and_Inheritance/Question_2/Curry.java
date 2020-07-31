/*Ontefetse Ditsele
 *
 *15 July 2020
 *
*/

public class Curry extends MenuItem{
   private String type;
      
   Curry(int number,String size,String cType){
      super(number,size);
      this.type = cType;
   }
   
   public String toString(){
      return "Curry: "+ super.toString() + ", " + this.type;
   }
}