
public class TemporaryEmployee extends Employee {
	private double pay4Hour;
	private int workHour;
	public TemporaryEmployee(String name, String address, String telno, Date joinDate, double pay4Hour) {
		super(name, address, telno, joinDate);
		// TODO Auto-generated constructor stub
		this.pay4Hour = pay4Hour;
		this.workHour = 0;
	}

	public void setWorkHours(int workHour) {// 왜 같은게 겁나 만ㄶ나 했더니 필드극 막아 둬서 그렇구나.
		this.workHour = workHour;
	}
	
	public double payCheck() {
		return pay4Hour * workHour;
	}

}
