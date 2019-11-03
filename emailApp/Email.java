package emailApp;

import java.util.Scanner;

public class Email {

	  private String firstName;
	    private String lastName;
	    private String password;
	    private int defaultPasswordLength =10;
	    private String department;
	    private String email;
	    private String companySuffix = "company.com";
	    private int mailboxCapacity = 500;
	    private String alternateEmail;


	    public Email(String firstName, String lastName ) {
	        this.firstName = firstName;
	        this.lastName = lastName;

	        this.department = setDepartment();


	        this.password = randomPassword(defaultPasswordLength);
	        System.out.println("Your password is : " + this.password);

	        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

	    }
	    //Ask for department
	    private String setDepartment() {
	        System.out.println("New worker : " + firstName + "\nDepartment Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
	        Scanner in = new Scanner(System.in);
	        int depChoice = in.nextInt();
	        if(depChoice == 1) {return "sales";}
	        else if (depChoice == 2){return "dev";}
	        else if(depChoice == 3) {return "acct";}
	        else {return "";}

	    }
	    //Generate random password
	    private String randomPassword(int length) {
	        String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXYZ0123456789!@#$%";
	        char[] password = new char[length];
	        for(int i=0; i<length;i++) {
	            int rand = (int) (Math.random()*passwordSet.length());
	            password[i] = passwordSet.charAt(rand);
	        }
	        return new String (password);
	    }

	    public void setMailBoxCapacity(int capacity) {
	        this.mailboxCapacity = capacity;
	    }

	    public void setAlernateEmail(String altEmail) {
	        this.alternateEmail = altEmail;
	    }

	    public void changePassword(String password) {
	        this.password = password;
	    }

	    public int getMailBoxCapacity() {return mailboxCapacity;}
	    public String getAlternateEmail() {return alternateEmail;}
	    public String getPassword() {return password;}

	    public String showInfo() {
	        return "DISPLAY NAME : " + firstName + " " + lastName +
	                "\nCOMPANY EMAIL : " + email +
	                "\nMAILBOX CAPACITY : " + mailboxCapacity + "mb";
	    }
	
	
}
