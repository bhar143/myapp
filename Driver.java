package com.gl.support.main;

import java.util.Scanner;

import com.gl.support.service.Service;

import gtlearning.Employee;

public class Driver {
	public static void main(String[] args) {
 String department = "";
  Employee emp = new Employee("bhanu","karveti", "gl", ".", "com");
  Service service  = new Service();
  System.out.println("Please Enter the deparetment from the following:");
  System.out.println("1.Technical");
  System.out.println("2.Admin");
  System.out.println("3.Human resource");
  System.out.println("4.Legal");
  Scanner sc = new Scanner(System.in);
  System.out.println("Please provide an apporpiate option:");
  int option = sc.nextInt();
  String email = "";
  String password = "";
 
  
  switch(option) {
  case 1:
	  System.out.println(service.generateEmailAddress(emp,"Tech"));
	  break;
  case 2:
	  System.out.println(service.generateEmailAddress(emp,"Admin"));
	  break;
  case 3:
	  System.out.println(service.generateEmailAddress(emp,"Human resource"));
	  break;
  case 4:
	  System.out.println(service.generateEmailAddress(emp,"Legal"));
	  break;
default:
  }
	}  
}
