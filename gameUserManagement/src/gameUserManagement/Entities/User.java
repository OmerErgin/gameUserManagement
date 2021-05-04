package gameUserManagement.Entities;
import gameUserManagement.Abstract.*;
public class User extends Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int dateYear;
	private long nationalityId;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, String email, String password, int dateYear,
			long nationalityId) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateYear = dateYear;
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getDateYear() {
		return dateYear;
	}
	public void setDateYear(int dateYear) {
		this.dateYear = dateYear;
	}
	public long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}

}
