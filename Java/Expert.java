import java.util.*;
public class Expert {
       public static void main(String[] args) {
           HRManager hr = new HRManager();
           Employee emp = new HRManager();
           hr.work();
           hr.getSalary();
           hr.addEmployee();
           emp.work();
    }
 }
class Employee {
     void work() {
         System.out.println("Chennai");
      }
      void getSalary() {
         System.out.println("100000");
       }
 }
class HRManager extends Employee {
        void work(){
          System.out.println("Bangalore");
         // super.work();
        }
        void addEmployee() {
           System.out.println("Shobna") ;
        }
   }
