
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		Car myCar2 = new Car(50); // 이거 color 왜 nulll 됐지??// 아 이거 알았는데 //
		myCar2.setColor("red");//생성자가 안 먹히는데 아까 찾은 거잖아. 0개은 0개에 대응, 1개는1ㅐ. 2개는2개에 그래서 0개쪽 생성자를 안 받은거.오버로딩!!!!
		Car myCar3 = new Car("Yellow", 100);
		Car myCar4 = new Car("Green");
		Car myCar5 = new Car();
		myCar5.setColor("green"); // 카4와 비교했을 때 선언 값에 다른 색을 주는 건 상관 없지만 set으로 주려하면 메서드에서 걸러지네.	
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