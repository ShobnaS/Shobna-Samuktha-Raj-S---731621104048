import java.util.*;
class Cat {
     void makeSound() {
        System.out.println("Mews");
    }
 }
class Dog extends Cat {
      void makeSound() {
         System.out.println("Barks");
         super.makeSound();
   }
}
public class Animals {
       public static void main(String[] args){
          //Cat cat = new Dog();
          Dog dg = new Dog();
          dg.makeSound();
         // cat.makeSound();
      }
   }