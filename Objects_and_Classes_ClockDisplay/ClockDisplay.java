/* Ontefetse Ditsele
 *   
 * 11 July 2020
*/

class ClockDisplay{

   //Instance Variables
   private CounterDisplay hours;
   private CounterDisplay minutes;
   
   //Constructor
   public ClockDisplay(int pHours,int pMinutes){
      hours = new CounterDisplay(24);
      hours.setValue(pHours);
      
      minutes = new CounterDisplay(60);
      minutes.setValue(pMinutes);
   
   }
   //Methods
   public void setTime(int pHours,int pMinutes){
      hours.setValue(pHours);
      minutes.setValue(pMinutes);
   
   }
   public void tick(){
      minutes.increment();
      if (minutes.getValue() == 0){
         hours.increment();
      }
   }
   public String getDisplayValue(){
      return hours.getDisplayValue() +":"+minutes.getDisplayValue();
   }
}