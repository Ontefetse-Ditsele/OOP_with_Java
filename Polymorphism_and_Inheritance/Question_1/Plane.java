/*Ontefetse Ditsele
 *
 *14 July 2020
*/

class Plane extends Vehicle{
   
   private String manufacture;
   private int modelNumber;
   
    Plane(String colour,int passengers,String manufacture,int modelNum){
        super(passengers,colour);
        this.manufacture   = manufacture;
        this.modelNumber   = modelNum;
    }
      
    public String toString(){
         return super.toString() +" "+ this.manufacture +" "+ this.modelNumber;
    }

}