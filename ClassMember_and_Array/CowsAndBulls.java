/*Ontefetse Ditsele
 *
 *
 *26 July 2020
*/

import java.util.*;

public class CowsAndBulls{

   private static NumberPicker seedRandom;
   private Result PlayerNumber;
   private int Guess;  private int Cows; 
   private int SecretNumber = 0; private int Bulls;
   
   public final static int NUM_DIGITS = 4; 
   public final static int MAX_VALUE = 9876;
   public final static int MIN_VALUE = 1234;
   public final static int MAX_GUESSES = 10;
   
   
   public CowsAndBulls(int seed){
      this.seedRandom    = new NumberPicker(seed,1,9);
      for(int i = 0; i < 4;i++){
         this.SecretNumber *= 10;
         this.SecretNumber += seedRandom.nextInt();
         
      }
      this.Guess         = MAX_GUESSES;
      
   }

   public int guessesRemaining(){
         return this.Guess;
   }
   
   public Result guess(int guessNumber){
        
        Cows  = NumberUtils.countintersect(this.SecretNumber, guessNumber); 
        Bulls = NumberUtils.countMatches(this.SecretNumber, guessNumber);
        
        Cows -= Bulls; 
        PlayerNumber = new Result(Cows, Bulls);
        this.Guess--;
        
        return PlayerNumber;
   }
   
   public int giveUp(){
        this.Guess = 0;
        return this.SecretNumber;
   
   }
   public boolean gameOver(){
      return (this.PlayerNumber.isCorrect() || this.Guess <= 0);
      /*
      if(Bulls == 4 || guess <= 0) return true;
      
      return false;*/
   }
}