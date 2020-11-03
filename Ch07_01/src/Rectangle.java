
public class Rectangle extends Geometry {
	private int width;
	private int height;
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.printf("¿øÇö : ($d, %d), (width - %d), (height - %d)", x, y, width, height);
	}

}
