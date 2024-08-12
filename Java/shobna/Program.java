package shobna;

class Employee {
     int employeeId ;
     String employeeName;
     float employeeSalary;
     Employee(int employeeId,String employeeName,float employeeSalary){
       this.employeeId = employeeId; 	
       this.employeeName = employeeName; 	
       this.employeeSalary = employeeSalary;	
}
 void display() {
	 System.out.println("EmployeeId :" + employeeId);
	 System.out.println("EmployeeName :" + employeeName);
	 System.out.println("EmployeeSalary :" + employeeSalary);
 }
 }
 public class Program{
	 public static void main(String[] args) {
		Employee emp = new Employee(101,"Shobna",2000.0f);
		emp.display();
		Employee emp1 = new Employee(102,"ShobnaS",3000.0f);
		emp1.display();
	 }
 }