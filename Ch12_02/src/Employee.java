
public class Employee {
	private String employeeName;
	private double salary;
	
	public Employee(String employeeName, double salary) {
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public String toString() { //toString ���ڿ� ��ȯ�ε� printf �Ⱦ��� �׳� ū�ٿ� ǥ�� �ع�����
		return "[employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	
	

	

}
