import java.util.*;
public class Person {
       int age;
       String name;
       public Person(int age ,String name ) {
           this.age = age ;
           this.name = name;
       }
      void display(){
          System.out.println("Enter the age :" + age);
          System.out.println("Enter the name :" + name);
         }
        public static void main(String[] args) {
        Person per = new Person(20,"Shobna"); 
        per.display();
         Person per1 = new Person(15,"Shobhika"); 
        per1.display();
     }
  }