
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(10, 20, 30, 40, 50, 60);
		Rectangle r = new Rectangle(10, 20, 30, 40);
		Circle c = new Circle(1000, 2000, 3000);
		Geometry [] geos = new Geometry[3];
		geos[0] = t;
		geos[1] = r;
		geos[2] = c;
		draw(geos);	
	
	}

	public static void draw(Geometry [] geos) {
		for(Geometry g : geos)
			g.draw();
	}

}
