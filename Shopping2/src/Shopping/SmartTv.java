package Shopping;

public class SmartTv extends Product {
	private String resolution;
	public SmartTv(String pname, int price, String resolution) {
		super(pname, price);
		// TODO Auto-generated constructor stub
		this.resolution = resolution;
	}
	@Override
	public void printDetail() {
		// TODO Auto-generated method stub
		super.printDetail();
	}
	@Override
	public void printExtra() {
		System.out.println("ÇØ»óµµ : "+resolution);
	}

}
