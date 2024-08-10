import java.util.*;
public class Largest{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
  //  if(a>b){
    // System.out.println("A is larger");
  //    }
     //else{
     //  System.out.println("B is Larger");
    // }
     if(a>b && a>c){
      System.out.println("Largest :" + a);
       }
      else if(b>a && b > c){
       System.out.println("Largest :" + b);
       }
      else if(c>a && c>b){
        System.out.println("Largest :" + c);
       }
  }
}