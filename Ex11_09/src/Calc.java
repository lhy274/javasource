
public class Calc {
	private double amount;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	void addValue(double v1, double v2) {
		System.out.println("double 값 계산 => " + (v1 + v2));
	}
	void addValue(int v1, int v2) {
		System.out.println("int 값 계산 => " + (v1 + v2));
	}

}
