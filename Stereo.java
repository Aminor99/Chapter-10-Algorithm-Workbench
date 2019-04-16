//Name: Asia Minor
//Date: 4-16-19
//Purpose: Algortihm Workbench chapter 10 #7
//Write the first line definition for a stereo class. the class should extend the soundsystem class, and it should
//implement the cdplayable, tunerplayer, and casseteplayable interfaces

public class Stereo extends SoundSystem implements CDPlayable, TunerPlayer, CassetePlayable{
  
   public Stereo(){
      
   }
   public static void main (String[] args){
      Stereo s1 = new Stereo();
      
      s1.isCDPlayable(true);
      s1.isTunerPlayable(false);
      s1.isCassetePlayable(false);
   }
}
class SoundSystem{
  
   public SoundSystem(){
      
   }
   
}
interface CDPlayable{
   
   default void isCDPlayable(boolean c){
      if (c = true)
         System.out.println("The CD is playable!");
      else 
         System.out.println("The CD is not playable.");
   }
}
interface TunerPlayer{
   
   default void isTunerPlayable(boolean t){
      if (t = true)
         System.out.println("The tuner is playable!");
      else 
         System.out.println("The tuner is not playable.");
   }
}
interface CassetePlayable{
   
   default void isCassetePlayable(boolean c){
      if (c = true)
         System.out.println("The cassete player is playable!");
      else 
         System.out.println("The cassete player is not playable.");
   }
}