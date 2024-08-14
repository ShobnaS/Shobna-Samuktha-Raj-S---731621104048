import java.util.*;
class Person {
       void getFirstName(){
           System.out.println("Shobna");
        }
       void getLastName() {
          System.out.println("S");
        }
    }
class Employee extends Person {
     void getEmployeeId() {
        System.out.println("101");
      }     
     void getJobTitle() {
        System.out.println("Engineer");
     }
     void getLastName() {
        System.out.println("Job Title: Engineer"); 
    }
 }
public class Details {
     public static void main(String[] args) {
         Person per = new Employee();
         Employee emp = new Employee();
         emp.getEmployeeId();
         emp.getFirstName();
         per.getLastName();
     }
  }     