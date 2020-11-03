
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("생산된 차량의 수 =>" + Car.getCount());

		Car myCar1 = new Car();
		System.out.println("생산된 차량의 수 =>" + Car.getCount());

		Car myCar2 = new Car();
		System.out.println("생산된 차량의 수 =>" + Car.getCount());

		Car myCar3 = new Car();
		
		System.out.println("생산된 차량의 수 =>" + Car.getCount());

		System.out.println("생산된 차량의 수 =>" + myCar1.getCount());

	}

}
