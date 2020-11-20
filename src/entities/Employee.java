package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
//		return name.compareTo(o.getName());
//		return -salary.compareTo(o.getSalary());
		return salary.compareTo(o.getSalary());
	}
	
}
