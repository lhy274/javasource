
public class Ex11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
			myCar1.color = "red";
			myCar1.speed = 0;
			myCar1.upSpeed(100);
		Car myCar2 = new Car();
			myCar2.color = "blue";
			myCar2.speed = 0;
			myCar2.upSpeed(50);
		Car myCar3 = new Car();
			myCar3.color = "yellow";
			myCar3.speed = 0;
			myCar3.upSpeed(80);
			
		System.out.printf("myCar1 : color %s, myCar1 : speed %d\nmyCar2 : color %s, myCar2 : speed %d\nmyCar3 : color %s, myCar3 : speed %d\n", myCar1.color, myCar1.speed, myCar2.color, myCar2.speed, myCar3.color, myCar3.speed);

	}

}

