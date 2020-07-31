/*Ontefetse Ditsele
 *
 *10 July 2020
*/

class UberService{

   private String UberName;
   private int UberCostPerMinute;
   private int UberCostPerKilo;
   private int UberBaseFee;
   private int UberCancellationFee;
   
   void setDetails(String name,int costPerMin,int costPerKM,int baseFee,int cancellationFee){
      UberName = name;
      UberCostPerMinute = costPerMin;
      UberCostPerKilo = costPerKM;
      UberBaseFee = baseFee;
      UberCancellationFee = cancellationFee;
   }
   void setName(String name){
      UberName = name;
   }
   String getName(){
      return UberName;
   }
   void setCostPerMinute(int cents){
      UberCostPerMinute = cents;
   }
   int getCostPerMinute(){
      return UberCostPerMinute;
   }
   void setCostPerKilometre(int cents){
         UberCostPerKilo = cents;
   }
   int getCostPerKilometre(){
         return UberCostPerKilo;
   }
   void setBaseFare(int cents){
      UberBaseFee = cents;
   }
   int getBaseFare(){
      return UberBaseFee;
   }
   
   void setCancellationFee(int n){
         UberCancellationFee = n;
   }
   int getCancellationFee(){
      return UberCancellationFee;
   }

   double calculateFare(double minutes,double distance){
      return (UberBaseFee + (minutes*UberCostPerMinute) + (distance*UberCostPerKilo));
   }

}