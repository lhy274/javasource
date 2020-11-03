
public class Employee {
	private String employeeName;
	private double salary;
	
	public Employee(String employeeName, double salary) {
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public String toString() { //toString 문자열 반환인데 printf 안쓰고 그냥 큰다운 표로 해버리네
		return "[employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	
	

	

}
