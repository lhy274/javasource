package Shopping;

public abstract class Product {
	private String pname;
	private int price;
	public Product(String pname, int price) {
		this.pname = pname;
		this.price = price;
	}
	
	public void printDetail() { //String pname, int price �Ű� ���� ���� �� �˾Ҵµ� �Ȥ���
		//System.out.println(pname); // ����ϰ� �����.
		System.out.println("��ǰ�� :"+pname);
		System.out.println("���� :"+price);
		printExtra();
	}
	abstract public void printExtra();

}
