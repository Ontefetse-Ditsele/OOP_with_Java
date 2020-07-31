/* Ontefetse Ditsele 
 *
 * 22 July 2020
*/


import java.util.*;

public class SoftDrink implements Comparable<SoftDrink>{
   private String name;
   private String colour;
   private int volume;
   
   public SoftDrink(String pName,String pColour,int pVolume){
      this.name   = pName;
      this.colour = pColour;
      this.volume = pVolume;
   
   }
   public int compareTo(SoftDrink other){
            
      if (this.name.equals(other.getName())){
         
         if (this.colour.equals(other.getColour())){
            
            return this.volume - other.getVolume();
         }
         return this.colour.compareTo(other.getColour());
      }
      return this.name.compareTo(other.getName());
   }
   
   public String getName(){ return this.name;}
   
   public String getColour(){ return this.colour;}
   
   public int getVolume(){  return this.volume; }
    
   public String toString(){
      
      return this.name+ " "+this.colour +" "+this.volume;   
      
   }
}