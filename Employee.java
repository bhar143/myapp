package gtlearning;

public class Employee {
	private String  firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	
	
	public Employee() {
		
	}
	
    public Employee(String firstname,String lastname, String email, String department, String password) {
    	this.firstname = firstname;
    	this.lastname  = lastname;
    	this.email     = email;
    	this.department= department;
    	this.password  = password; 	
 		
}

	public  String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	}

