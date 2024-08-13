import  java.util.*;
class Employee {
    private String name;
    private String title;
    private int salary;
    private int pf;
    public Employee(String name,String title,int salary){
       this.name = name;
       this.title = title;
       this.salary = salary;
       
      }
     public String getName() {
       return name;
     }
     public void setName(String name){
         this.name = name;
     }
     public String getTitle(){
        return title;
     }
     public void setTitle(String title){
        this.title = title;
     }
     public int getSalary(){
        return salary;
     }
     public void setSalary(int salary){
        this.salary = salary;
     }
      public int getPf(){
        return pf;
     }
     public void setPf(int pf){
        this.pf = pf;
     }
   void calculate(int pf){
     int amount = salary - pf;
     System.out.println(amount);
 }
}
 public class Demo {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String nam = sc.nextLine();
       String tit = sc.nextLine();
       int sal = sc.nextInt();
       Employee emp = new Employee(nam,tit,sal);
       System.out.println("Name :" + emp.getName());
       System.out.println("Job Title :" + emp.getTitle());
       System.out.println("Salary :" + emp.getSalary());
       emp.setName("ShobnaS");
       emp.setTitle("Teacher");
       emp.setSalary(56000);
       System.out.println("Updated Title :" + emp.getName());
       System.out.println("Updated Author :" + emp.getTitle());
       System.out.println("Updated Salary :" + emp.getSalary());
       emp.setPf(5000);
      emp.calculate(emp.getPf());
   }
}
      