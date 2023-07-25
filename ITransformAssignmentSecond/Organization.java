package ITransformAssignmentSecond;


class Employee {

	private int id;

	private long salary;

	public Employee(int id, long salary) {
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long calculateSalary() {
		return salary;
	}
	
	

}

class Manager extends Employee {

	private long intensive;

	public Manager(int id, long salary, long intensive) {
		super(id, salary);
		this.intensive = intensive;
	}

	public long getIntensive() {
		return intensive;
	}

	public void setIntensive(long intensive) {
		this.intensive = intensive;
	}

	@Override
	public long calculateSalary() {
		return getSalary() + intensive;
	}

	@Override
	public String toString() {
		return "Manager [intensive=" + intensive + "]";
	}
	
	

}

class Labour extends Employee {

	private long overTime;

	public Labour(int id, long salary, long overTime) {
		super(id, salary);
		this.overTime = overTime;
	}

	public long getOverTime() {
		return overTime;
	}

	public void setOverTime(long overTime) {
		this.overTime = overTime;
	}

	public long calculateSalary() {
		return getSalary() + overTime;
	}

	@Override
	public String toString() {
		return "Labour [overTime=" + overTime + "]";
	}
	
	
}

public class Organization {

	public static void main(String[] args) {
		
		Manager manager = new Manager(12, 30000, 5000);
		Labour labour = new Labour(13, 20000, 4000);
		
		System.out.println(manager.getId());
		System.out.println(manager.getSalary());
		System.out.println(manager.calculateSalary());
		
		
		System.out.println(labour.getId());
		System.out.println(labour.getSalary());
		System.out.println(labour.calculateSalary());
		
		
		
		

	}

}



