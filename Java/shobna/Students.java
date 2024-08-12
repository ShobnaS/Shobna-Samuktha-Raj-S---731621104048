package shobna;

import java.util.Scanner;

public class Students {
    private int regno;
    private String stuName;
    private int[] marks;
    private int sum;
    private int avg;
   
    // Constructor to initialize student details
    public Students(int regno, String stuName, int numOfSubjects) {
        this.regno = regno;
        this.stuName = stuName;
        this.marks = new int[numOfSubjects];
    }
   
    // Method to get marks from user
    public void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for " + marks.length + " subjects:");
        for(int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
    }
   
    // Method to calculate the sum, average and grade
    public void calculateGrade() {
        sum = 0;
        for(int mark : marks) {
            sum += mark;
        }
        avg = sum / marks.length;
        System.out.println("Average: " + avg);
       
        // Determine grade based on average
        if(avg >= 90) {
            System.out.println("Grade: A");
        } else if(avg >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
   
    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student registration number: ");
        int regno = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter student name: ");
        String stuName = sc.nextLine();
        System.out.print("Enter number of subjects: ");
        int numOfSubjects = sc.nextInt();
       
        Students student = new Students(regno, stuName, numOfSubjects);
        student.getMarks();
        student.calculateGrade();
    }
}