
public class SalesEmployee extends RegularEmployee {
	private double rate;
	private double seles;

	public SalesEmployee(String name, String address, String telno, Date joinDate, double salary, double rate) {
		super(name, address, telno, joinDate, salary);
		// TODO Auto-generated constructor stub
		this.rate = rate;
		this.seles = 0;
	}
	public void setSeles(double seles) {
		this.seles = seles;
	}
	
	public double payCheck() {
		return super.salary + (rate*seles);
	}

}
