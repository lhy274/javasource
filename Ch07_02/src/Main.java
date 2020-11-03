
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(10, 20, 30, 40, 50, 60);
		Rectangle r = new Rectangle(10, 20, 30, 40);
		Circle c = new Circle(1000, 2000, 3000);
		t.draw();
			
		Geometry [] geos = new Geometry[3]; 
		geos[0] = t;
		geos[1] = r;
		geos[2] = c;
		for(Geometry geo : geos)
		geo.draw();
/*
		Geometry g = new Geometry(10, 20);
		g.draw();
	
		
		
		private static void draw(Geometry[] geos) {
			for(Geometry g : geos)
				g.draw();

		}
		*/
	
	}

}
