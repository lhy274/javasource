package employee;
import common.Date;

public class RegularEmployee extends Employee {
	protected double salary; // protected는 SalesEmployee payCheck 할때 비공개 풀라고 한거임.
	public RegularEmployee(String name, String address, String telno, Date joinDate, double salary) {
		super(name, address, telno, joinDate);
		this.salary = salary;
		System.out.println("레귤러 사원 어떻게 되나보자");
	}
	
	public double payCheck() {
		return salary;
	}
	
	//public void salaryCount(double salary) {
		//this.salary = salary;
	//}
	//public double getSalary() {
		//return salary;
	//}
}
