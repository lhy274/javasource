
public class Car {
	private String color;
	private int speed;
	static private int count = 0;
	
	Car() {
		count++;
	}
	
	static int getCount() {
		return count;
	}

}
