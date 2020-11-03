class Car {
	private String color;
	private int speed = 0;

	public Car() {   // �����ڴ� �޼ҵ�� �޼��忡���� ����()�� ��ġ����.
		color = "Blue";
		speed = 0;
	}
	public Car(String color) { /// �빮��!!!!!! Ŭ���� �̸��� ���ƾ���.
		this.color = color;
		this.speed = 0;
	}
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public void upSpeed(int value) {
		if(speed + value > 200) 
			speed = 200;
		else
			speed += value;
		System.out.printf("%d\n", getSpeed());
	}
	
	public void downSpeed(int value) {
		if(speed - value < 0) 
			speed = 0;
		else
			speed -= value;
		System.out.println(getSpeed());
	}
	
	public void setColor(String color) {
		if(color.equals("red") || color.equals("blue") || color.equals("yellow"))
		this.color = color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	
	
}