package Shopping;

public class CellPhone extends Product {
	
	private String carrier;
	
	public CellPhone(String pname, int price, String carrier) {
		super(pname, price);
		// TODO Auto-generated constructor stub
		this.carrier = carrier;
	}

	@Override
	void printExtra() {
		System.out.println("통신사 정보 : "+carrier);

	}

}
