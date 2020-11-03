package Shopping;

public class SmartTv extends Product {
	
	private String resolution;
	
	public SmartTv(String pname, int price, String resolution) {
		super(pname, price);
		this.resolution = resolution;
	}
	
	@Override
	void printExtra() {
		System.out.println("해상도 정보 : "+resolution);

	}

}
