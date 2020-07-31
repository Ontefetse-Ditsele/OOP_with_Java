/*Ontefetse Ditsele
 *
 *14 July 2020
*/

class Car extends Vehicle{
      private int numOfDoors;
   
      Car(String colour,int passengers,int doors){
        super(passengers,colour);
        this.numOfDoors = doors;
      }
      
      public String toString(){
         return super.toString()+ " "+ this.numOfDoors+ " doors";
      }
}