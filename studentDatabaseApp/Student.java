package studentDatabaseApp;

import java.util.Scanner;

public class Student {
private String firstName;
private String lastName;
private int gradeYear;
private String studentId;
private String courses;
private int tuitionBalance;
private static int costOfCourse=600;
private static int id =1000;

public Student () {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter student first name : ");
	this.firstName = sc.nextLine();
	
	System.out.println("Enter student last name : ");
	this.lastName = sc.nextLine();
	
	System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade level : ");
    this.gradeYear = sc.nextInt();
    
    setStudentId();
    
}

private void setStudentId() {
	id++;
	this.studentId = gradeYear + "" + id;
	
}

public void enroll() {
	do {
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner sc = new Scanner(System.in);
		String course = sc.nextLine();
		if(!course.equals("Q")) {
			courses = "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
			
		}
		else {
			
			break;
		}
	} while(1!=0);
	
	
	
}

public void viewBalance() {
	System.out.println("Your balance is : $" + tuitionBalance);
}

public void payTuition() {
	viewBalance();
	System.out.println("Enter your payment: $");
	Scanner sc = new Scanner(System.in);
	int payment = sc.nextInt();
	tuitionBalance = tuitionBalance - payment;
	System.out.println("Thank you for your payment of $" + payment);
	viewBalance();
}

public String toString() {
	return "Name : " + firstName + " " + lastName +
			"\nStudent ID : " + studentId +
			"\nGrade Level : " + gradeYear +
			"\nCourses Enrolled : " + courses + 
			"\nBalance : $" + tuitionBalance;
}

}
