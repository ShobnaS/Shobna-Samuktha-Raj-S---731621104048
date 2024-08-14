import java.util.*;
class Animal {
     void move() {
        System.out.println("Types");
    }
 }
class Cheetah extends Animal {
      void move() {
         System.out.println("Terror");
        // super.makeSound();
   }
}
public class Wild {
       public static void main(String[] args){
          Animal cat = new Cheetah();
          Dog dg = new Dog();
          //dg.makeSound();
           cat.move();
      }
   }