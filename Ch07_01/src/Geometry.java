
public abstract class Geometry {
	protected int x;
	protected int y;
	public Geometry(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract public void draw();
		//System.out.printf("µµÇü : (%d, %d)", x, y);
	

}
