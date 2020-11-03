package Shopping;

public abstract class Product {
	private String pname;
	private int price;
	public Product(String pname, int price) {
		this.pname = pname;
		this.price = price;
	}
	
	public void printDetail() { //String pname, int price 매겨 변수 쓰는 줄 알았는데 안ㅆ네
		//System.out.println(pname); // 비슷하게 맞춰네.
		System.out.println("상품명 :"+pname);
		System.out.println("가격 :"+price);
		printExtra();
	}
	abstract public void printExtra();

}
