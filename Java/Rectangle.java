import java.util.*;
class Shapes {
     float width;
     float height;
     Shapes(float width , float height){
      this.width = width;
      this.height = height;
     }
     void Area() {
         float area = width * height;
         System.out.println("Area of the Rectangle :" +area);
      }
     void Perimeter() {
        float perimeter = 2*(width + height);
        System.out.println("Perimeter of the Rectangle :" +perimeter);
      }
  }
public class Rectangle {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the width :");
       int a = sc.nextInt();
       System.out.println("Enter the height :");
       int b = sc.nextInt();
       Shapes shape = new Shapes(a,b);
       shape.Area();
       shape.Perimeter();
      // Shapes shape1 = new Shapes(20,20);
       //shape1.Area();
       //shape1.Perimeter();
    }
  }