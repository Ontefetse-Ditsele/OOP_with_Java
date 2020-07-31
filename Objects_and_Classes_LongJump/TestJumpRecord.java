/* Ontefetse Ditsele
 *
 * 17 July 2020
*/

class TestJumpRecord{
      public static void main(String[] args){
        
        //Check the getLongest Method    
        System.out.println("Test 1");
        JumpRecord longJump = new JumpRecord();
        
        longJump.recordJump(11.2); 
        longJump.recordJump(13.5); 
        longJump.recordJump(9.5);
        
        if (longJump.getLongest() == 2) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        
         System.out.println("Test 2");
         longJump = new JumpRecord();
        
         longJump.recordJump(10.4); 
         longJump.recordJump(13.5); 
         longJump.recordJump(19.3);
        
        if (longJump.getLongest() == 3) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }        
         
         System.out.println("Test 3");
         longJump = new JumpRecord();
        
         longJump.recordJump(16.2); 
         longJump.recordJump(13.5); 
         longJump.recordJump(12.7);
        
         if(longJump.getLongest() == 1) {
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         }        
         
         //Test the getJumpDistance Method
         System.out.println("Test 4");
         longJump = new JumpRecord();
        
        longJump.recordJump(16.2); 
        longJump.recordJump(13.5); 
        longJump.recordJump(12.7);
        
        if (longJump.getJumpDistance(1) == 16.2
         && longJump.getJumpDistance(2) == 13.5
         && longJump.getJumpDistance(3) == 12.7
            ) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        
        //Test the RecordFoulJump & isFoulJump methods
         System.out.println("Test 5");
         longJump = new JumpRecord();
        
         longJump.recordJump(11.1); 
         longJump.recordJump(12.2); longJump.recordFoulJump(); 
         longJump.recordJump(13.3);
        
         if (longJump.isFoulJump(1) == false
          && longJump.isFoulJump(2) == true
          && longJump.isFoulJump(3) == false 
             ){
            
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         }        
        
        
         System.out.println("Test 6");
         longJump = new JumpRecord();
        
         longJump.recordJump(11.1); longJump.recordFoulJump(); 
         longJump.recordJump(13.3);
         longJump.recordJump(12.2);
         
         if (longJump.isFoulJump(1) == true) {
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         }
         
         System.out.println("Test 7");
         longJump = new JumpRecord();
        
         longJump.recordJump(11.1); longJump.recordFoulJump();    
         longJump.recordJump(12.2); longJump.recordFoulJump();
         longJump.recordJump(13.3);
        
         if (longJump.foulJumps() == 2){
            
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         }
         
         System.out.println("Test 8");
         longJump = new JumpRecord();
        
         longJump.recordJump(11.1);    
         longJump.recordJump(12.2);
         longJump.recordJump(13.3);        
         
         //Test the maxJumps Method
         if (longJump.maxJumps() == 3){
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         }
 
         System.out.println("Test 9");
         longJump = new JumpRecord();
        
        
         if (longJump.maxJumps() == 3){
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         }               
         
         //Test the finished method
         System.out.println("Test 10");
         longJump = new JumpRecord();
        
         longJump.recordJump(11.1);    
         longJump.recordJump(12.2);
         longJump.recordJump(13.3);        
         
         if (longJump.finished() == true){
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         }         

         System.out.println("Test 11");
         longJump = new JumpRecord();
        
         longJump.recordJump(11.1);    
         longJump.recordJump(12.2);       
         
         if (longJump.finished() == false){
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         }                  
         
         //Test the jumps method
         System.out.println("Test 12");
         longJump = new JumpRecord();
        
         longJump.recordJump(11.1);    
         longJump.recordJump(12.2);
         longJump.recordJump(13.3);        
         
         if (longJump.jumps() == 3){
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         } 
        
         System.out.println("Test 13");
         longJump = new JumpRecord();
        
         longJump.recordJump(11.1);    
         longJump.recordJump(12.2);        
         
         if (longJump.jumps() == 2){
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         }
                 
         System.out.println("Test 14");
         longJump = new JumpRecord();
        
         longJump.recordJump(11.1);    
         longJump.recordJump(12.2);        
         
         if (longJump.jumps() == longJump.jumps()){
            System.out.println("Pass");
         }
         else {
            System.out.println("Fail");
         }        
      }
}