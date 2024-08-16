class Employeee{
	
	int salary;
	 Employeee(int salary)
	{
		this.salary=salary;
	}
	int calculateSalary() {
		System.out.println("The salary of an employee is :"+salary);
		return salary;
	}
	
}

class Manager extends Employeee{

	Manager(int salary) {
		super(salary);
		
	}
	int calculateSalary() {
		System.out.println("The salary of a manager  is :"+salary);
		return salary;
	}
	
}
class Programmer extends Employeee
{
	
	Programmer(int salary) {
		super(salary);
		
	}
	int calculateSalary() {
		System.out.println("The salary of an programmer is :"+salary);
		return salary;
	}
	
}

public class Employee {

	public static void main(String[] args) {
		
		Employeee emp=new Employeee(10000);
		Manager manager=new Manager(100000);
		Programmer programmer=new Programmer(500000);
		manager.calculateSalary();
		programmer.calculateSalary();
	}

}
