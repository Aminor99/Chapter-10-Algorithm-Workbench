//Name: Asia Minor
//Date:4-26-19
//Purpose: Write a statement that uses a lambda expression to create an object that implements the Computable interface. 
//The object’s name should be half. The half object’s compute method should return the value of the x parameter divided by 2.

import java.util.Scanner;

interface Computable{
   double compute (double x);
}

class LambdaAndInterfaceDemo {
   public static void main (String[] args){
      Computable half = x -> x * .5;
      
      Scanner kb = new Scanner (System.in);
      System.out.println("Enter a number please.");
      double num = kb.nextDouble();
      
      System.out.println("Half of " + num + " is " + half.compute(num));
   }
}