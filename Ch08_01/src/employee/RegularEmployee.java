package employee;
import common.Date;

public class RegularEmployee extends Employee {
	protected double salary; // protected�� SalesEmployee payCheck �Ҷ� ����� Ǯ��� �Ѱ���.
	public RegularEmployee(String name, String address, String telno, Date joinDate, double salary) {
		super(name, address, telno, joinDate);
		this.salary = salary;
		System.out.println("���ַ� ��� ��� �ǳ�����");
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
