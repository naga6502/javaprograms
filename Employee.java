package practice;

public class Employee {
	private int id;
	private String name;
	private Number sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getSal() {
		return sal;
	}
	public void setSal(Number sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public Employee(int id, String name, Number sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	
	
}
