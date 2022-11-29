package day1;

import java.util.Scanner;

public class HelloLastNameFirstName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name:");
		String fname=sc.nextLine();
		System.out.println("enter last name:");
		String lname=sc.nextLine();
		System.out.println("Hello "+fname+" "+lname);
	}

}
