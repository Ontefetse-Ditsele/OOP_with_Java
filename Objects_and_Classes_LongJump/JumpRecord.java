/*Ontefetse Ditsele
 *
 *16 July 2020
*/

public class JumpRecord{

       private boolean[] foulJumps = new boolean[3];
       private double[]  distances = new double[3];
   
      private int jumpNum = 0;
      private int max     = 2;
      private int longest;
      
      public JumpRecord(){ }
   
   
      public void recordJump(double distance){
            distances[jumpNum]  = distance;
            foulJumps[jumpNum]   = false;
            jumpNum++;
      }
      
      public void recordFoulJump(){
         foulJumps[jumpNum-1] = true;
      }
      
      public int jumps(){
         return jumpNum;
   }
   
   public boolean finished(){
   
      if (jumpNum > max) 
                  return true;
      
      return false;
   }
   public int maxJumps(){
         
         return max+1;
   }
   
   public int foulJumps(){
   
      int num = 0;
      for (boolean foul: foulJumps){
           if (foul) num++;
      }
      return num;
   }
   
   public boolean isFoulJump(int n){ 
         return foulJumps[n-1];
   }
   
   public double getJumpDistance(int n){
         return distances[n-1];
   }
   public int getLongest(){
      if (distances[0] >= distances[1]){ 
         this.longest = 0;
      
      }else{ 
         this.longest = 1;
      }
      
      
      if(distances[this.longest] < distances[2]){
            this.longest = 2;
      }
      
      return this.longest+1;
   }
}