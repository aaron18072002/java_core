package live.demo;

import java.util.Date;

public abstract class Employee {
	private int id;
	private String name;
	private Date date;
	private int salaryCoefficient;
	
	public Employee() {
		
	}

	public Employee(int id, String name, Date date, int salaryCoefficient) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(int salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", date=" + date + ", salaryCoefficient=" + salaryCoefficient
				+ "]";
	}
	
}
