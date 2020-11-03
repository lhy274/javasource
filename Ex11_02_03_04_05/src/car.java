class Car {
	private String color;
	private int speed = 0;
	
	
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