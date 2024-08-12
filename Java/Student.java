import java.util.*;
public class Student {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student registration number");
        int regNo = sc.nextInt();
        System.out.println("Enter student name");
        String studentName = sc.next();
        System.out.println("Enter number of subjects");
        int subjects = sc.nextInt();
        Students stu = new Students(regNo,studentName , subjects);
        stu.getMarks();
        stu.calculateGrade();
        stu.display();
 }
}
 class Students{
   int regno;
   String stuName;  
   int[] marks;
   int sum;
   int avg;
   public Students(int regno , String stuName , int subjects){
        this.regno = regno;
        this.stuName = stuName ;
        this.marks = new int[subjects];
   }
  public void getMarks(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter marks");
       for(int i = 0; i<marks.length;i++){
         marks[i] = sc.nextInt();
      }
  }
  public void calculateGrade() {
       sum = 0;
       for(int mark : marks ){
         sum += mark;
       }
       avg = sum/marks.length;
       System.out.println("Sum of marks: " + sum);
        System.out.println("Average: " + avg);
        System.out.print("Grade: ");
       if(avg >= 90) {
            System.out.println("Grade: A");
        } else if(avg >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
   public void display(){
        System.out.println("Student Registration Number: " + regno);
        System.out.println("Student Name: " + stuName);
        System.out.println("Marks:");
        for (int mark : marks) {
         System.out.println(mark);  
  }
}
}
