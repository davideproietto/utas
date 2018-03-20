package it.dping.projectwork.utas.model;

import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="USERX")
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class User extends AEntity<String>{
	@Id
	private String username;
	
	private String password;
	
	private String name;
	
	private String surname;
	
	private String sex;
	
	private String level;
	
	private String task;   //mansione
	
	private String email;
	
	
	
	@Temporal(TemporalType.DATE)
	private Date timeBirth;
	
	@Embedded
	private Address address;
	
	@Embedded
	private Salary salary;
	
	public String getOid() {
		return getUsername();
	};
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getTimeBirth() {
		return timeBirth;
	}
	
	public void setTimeBirth(Date timeBirth) {
		this.timeBirth = timeBirth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	@Override
	public String toString() {
		return "User [getOid()=" + getOid() + ", getUsername()=" + getUsername() + ", getAddress()=" + getAddress()
				+ ", getEmail()=" + getEmail() + ", getTimeBirth()=" + getTimeBirth() + ", getPassword()="
				+ getPassword() + ", getName()=" + getName() + ", getSurname()=" + getSurname() + ", getSex()="
				+ getSex() + ", getLevel()=" + getLevel() + ", getTask()=" + getTask() + "]";
	}

}
