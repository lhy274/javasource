
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		Car myCar2 = new Car(50); // �̰� color �� nulll ����??// �� �̰� �˾Ҵµ� //
		myCar2.setColor("red");//�����ڰ� �� �����µ� �Ʊ� ã�� ���ݾ�. 0���� 0���� ����, 1����1��. 2����2���� �׷��� 0���� �����ڸ� �� ������.�����ε�!!!!
		Car myCar3 = new Car("Yellow", 100);
		Car myCar4 = new Car("Green");
		Car myCar5 = new Car();
		myCar5.setColor("green"); // ī4�� ������ �� ���� ���� �ٸ� ���� �ִ� �� ��� ������ set���� �ַ��ϸ� �޼��忡�� �ɷ�����.	
		Car myCar6 = new Car();

		
		myCar3 = myCar1;
		myCar3.upSpeed(80);
		
		if(myCar1 == myCar3)
			System.out.println("=");
		else
			System.out.println("!=");

		if(myCar1.equals(myCar3))
			System.out.println("equals");
		else
			System.out.println("false");
		
		if(myCar5 == myCar6)
			System.out.println("=");
		else
			System.out.println("!=");

		if(myCar5.equals(myCar6))
			System.out.println("equals");
		else
			System.out.println("false");
		
		System.out.printf("myCar1 color=%s speed=%d\n", myCar1.getColor(), myCar1.getSpeed());
		System.out.printf("myCar2 color=%s speed=%d\n", myCar2.getColor(), myCar2.getSpeed());
		System.out.printf("myCar3 color=%s speed=%d\n", myCar3.getColor(), myCar3.getSpeed());
		System.out.printf("myCar4 color=%s speed=%d\n", myCar4.getColor(), myCar4.getSpeed());
		System.out.printf("myCar5 color=%s speed=%d\n", myCar5.getColor(), myCar5.getSpeed());
		System.out.printf("myCar6 color=%s speed=%d\n", myCar5.getColor(), myCar6.getSpeed());


	}

}