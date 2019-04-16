//Name: Asia Minor
//Date: 4-16-19
//Purpose: Algortihm Workbench chapter 10 #3

public class D extends B{

   private double q;
   protected double r;
   
   public void setQ (int Q){
      q = Q;
   }
   public double getQ (){
      return q;
   }
   public void setR (int R){
      r = R;
   }
   public double getR (){
      return r;
   }
   @Override
   public double calc (){
      return r * q;
   }
}