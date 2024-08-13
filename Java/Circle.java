import java.util.*;
class Shapes {
     double radius;
     Shapes(int radius){
      this.radius = radius;
     }
     void Area() {
         double area = 3.14 * radius * radius;
         System.out.println("Area of the Circle :" +area);
      }
     void Perimeter() {
        double perimeter = 2*3.14 * radius;
        System.out.println("Perimeter of the Circle :" +perimeter);
      }
  }
public class Circle {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the radius :");
       int a = sc.nextInt();
       Shapes shape = new Shapes(a);
       shape.Area();
       shape.Perimeter();
      // Shapes shape1 = new Shapes(20,20);
       //shape1.Area();
       //shape1.Perimeter();
    }
  }