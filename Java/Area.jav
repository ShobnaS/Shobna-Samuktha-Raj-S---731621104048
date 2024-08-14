import java.util.*;
class Shape {
     void print() {
        System.out.println("Area of the Rectangle");
    }
    Shape(int a, int b){
       System.out.println("Rectangle :" + (a*b));
    }
 }
class Rectangle extends Shape {
      void calculate() {
         System.out.println("Calculated");
   }
      super(5,10);
}
public class Area{
       public static void main(String[] args){
          Rectangle rect = new Rectangle();
          rect.print();
          rect.calculate();
      }
   }