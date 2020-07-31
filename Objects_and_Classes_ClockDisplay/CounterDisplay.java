/* Ontefetse Ditsele
 *   
 * 11 July 2020
*/
class CounterDisplay{
   //Instance
   private int value;
   private int limit;
   
   //Contructor
   public CounterDisplay(int pLimit){
      limit = pLimit;
      value = 0;
   }
   
   //Methods
   public void setValue(int pValue){
   }
   
   public int getValue(){
      return value;
   }
   public void increment(){
      value++;
      if (value == limit){
         value = 0;
      }
   }
   public String getDisplayValue(){
      if (value < 10)
            return "0"+value;
            
      return Integer.toString(value);
   }
}