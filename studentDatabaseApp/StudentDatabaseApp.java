package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
	    System.out.println("Enter number of students to enroll : ");
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		Student[] students = new Student[numberOfStudents];
       
		for(int i=0; i<numberOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		
		for(int i=0; i<numberOfStudents; i++) {
			System.out.println(students[i].toString());
		}
		
	}
}
