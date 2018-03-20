package it.dping.projectwork.utas.model;
import java.util.Date;
import java.util.*;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Salary {
	private List<Salary> salaries = new ArrayList<>();
	private String year;

	private Double salary;
	private int hoursTot;
	private int hoursStraord;
	private int hoursFest;
	private int hoursFerie;
	private int hoursMalattia;
	
	@Temporal(TemporalType.DATE)
	private Date dateSalary;

	public List<Salary> getSalaries() {
		return salaries;
	}

	public void setSalaries(List<Salary> salaries) {
		this.salaries = salaries;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getHoursTot() {
		return hoursTot;
	}

	public void setHoursTot(int hoursTot) {
		this.hoursTot = hoursTot;
	}

	public int getHoursStraord() {
		return hoursStraord;
	}

	public void setHoursStraord(int hoursStraord) {
		this.hoursStraord = hoursStraord;
	}

	public int getHoursFest() {
		return hoursFest;
	}

	public void setHoursFest(int hoursFest) {
		this.hoursFest = hoursFest;
	}

	public int getHoursFerie() {
		return hoursFerie;
	}

	public void setHoursFerie(int hoursFerie) {
		this.hoursFerie = hoursFerie;
	}

	public int getHoursMalattia() {
		return hoursMalattia;
	}

	public void setHoursMalattia(int hoursMalattia) {
		this.hoursMalattia = hoursMalattia;
	}

	public Date getDateSalary() {
		return dateSalary;
	}

	public void setDateSalary(Date dateSalary) {
		this.dateSalary = dateSalary;
	}
	
}
