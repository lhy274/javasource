
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
			//myCar1.setColor("red");
			myCar1.setSpeed(0);
			myCar1.upSpeed(300);
		Car myCar2 = new Car("Red");  // 호출값을 줄때 인트(데이터값) 안써도 되는구나
			//myCar2.setColor("blue2");
			myCar2.setSpeed(0);
			myCar2.downSpeed(250);
		Car myCar3 = new Car("Yellow", 100); 
			//myCar3.setColor("yellow");
			myCar3.setSpeed(0);
			myCar3.upSpeed(80);
			Car myCar4 = new Car();
			myCar4.upSpeed(150);
			myCar4.upSpeed(100);
			myCar4.downSpeed(80);
			myCar4.downSpeed(150);
			
		System.out.printf("myCar1 color=%s speed=%d\n", myCar1.getColor(), myCar1.getSpeed());
		System.out.printf("myCar2 color=%s speed=%d\n", myCar2.getColor(), myCar2.getSpeed());
		System.out.printf("myCar3 color=%s speed=%d\n", myCar3.getColor(), myCar3.getSpeed());
}

}
