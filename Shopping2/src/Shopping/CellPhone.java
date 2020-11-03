package Shopping;

public class CellPhone extends Product {
	String carrier;
	public CellPhone(String pname, int price, String carrier) {
		super(pname, price);
		this.carrier = carrier;
	}
	@Override
	public void printExtra() {
		System.out.println("Ελ½Ε»η :"+carrier);
		
	}
	@Override
	public void printDetail() {
		// TODO Auto-generated method stub
		super.printDetail();
	}

	

}
