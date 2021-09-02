package com.gl.support.service;

import java.util.Random;


import gtlearning.Employee;

public class Service {
	
public Char[] generatePassword() {
	
	String captilLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters  = "abcdefghijklmnopqrstuvwxyz";
	String numbers       = "0123456789";
	String specialCharcters = "!@#$%^&*_=+-/.?<>";


String values = captilLetters + smallLetters + numbers + specialCharcters;

	
	Random random = new Random();
	
	Char[] password = new Char[8];
	
	for(int i = 0; i<8;i++) {
		int rand = (int)(3*Math.random());

		
	}

	return password;
	password[i] = values.charAt(random.nextInt(values.length()));

}

public String generateEmailAddress(Employee emp,String dept)
{
	return emp.getFirstname()+emp.getLastname()+"\n@"+dept+"gl."+emp.getPassword()+"\n456789\n";
}


public	void showCredentials(Employee employee,String email,char[] generatedPassword) {
	System.out.println(" Dear "+employee.getFirstname()+"bhanu"+employee.getLastname()+"kalla"+" your generated credentials are as follows");
	System.out.println("Email--->"+email+"bhanukalla@gl.com");
	System.out.println("password ---> 1"+"");
	System.out.println(generatedPassword);

}


}

		

