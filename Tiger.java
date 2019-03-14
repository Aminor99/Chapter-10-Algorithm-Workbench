/**
   Asia Minor
   3-13-19
   Algorithm Workbench 2
   Look	at	the	following	code,	which	is	the	first	line	of	a	class	definition: 
   public class Tiger extends Felis  In what order will the class constructors execute?
*/
public class Tiger extends Felis{ //a tiger isnt part of the felis genus btw
   private String breed;
   private int weight;
   /**
      The constructor
      @param b, the bread of the tiger
      @param d, what the tiger eats
      @param l, where the tiger lives
      @param s, the size of the tiger
      @param aL, the averageLifespan of the tiger
      @param w, the weight of the tiger
   */
   public Tiger(String b, String d, String l, String s, int aL, int w){
      super(d, l, s, aL);
      breed = b;
      weight = w;
   }
   //And to answer the question, the Felis constructor will be called before the Tiger constructor
}   