//Name:Asia Minor
//Date: 4-17-19
//Purpose: algorithm workbench chapter 10 #8
//write an interface named nameable that specifies the following methods "public void setName(string n)" and "public String getName()"

public class NameableDemo {

   public static void main (String[] args){
      Person p = new Person(84, "Henry");
      System.out.println("This person's name is " + p.getName());
      
   }

}

class Person implements Nameable{
   int age;
   String name;
   public Person(int a, String n){
      age = a;
      name = n;
   }
   @Override
   public void setName(String n){
      name = n;
   }
   public String getName(){
      return name;
   }
}