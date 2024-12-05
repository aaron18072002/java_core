package live.demo;

import java.util.Date;

public class Director extends Employee {
	private int positionCoefficient;
	
	public Director() {
		
	}

	public Director(int id, String name, Date date, int salaryCoefficient, int positionCoefficient) {
		super(id, name, date, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
	}

	public int getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(int positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return "Director [positionCoefficient=" + positionCoefficient + ", getName()=" + getName() + ", getDate()="
				+ getDate() + ", getSalaryCoefficient()=" + getSalaryCoefficient() + ", getId()=" + getId() + "]";
	}
	
}
