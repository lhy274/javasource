
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> si = new Stack<Integer>(5);
		si.push(10);
		si.push(100);
		si.push(1000);
		
		/*
		int size = si.size();
		for(int i = 0; i < size; i++) {
			System.out.println(si.size());
			int r = si.pop();
			System.out.println(r);
			System.out.println(si.size());
		}
		*/
		Stack<Character> sc = new Stack<Character>(5);
		sc.push('c');
		char ch = sc.pop();
		System.out.println(ch);
		
		point p1 = new point(10, 20);
		Stack<point> sp = new Stack<point>(1);
		sp.push(p1);
		//point p = sp.pop();
		//System.out.printf("%d, %d\n", p.getX(), p.getY()); // 그냥 p로 주면 point@73a8dfcc    이걸로 나와.
		
		IStack<Integer> si2 = new Stack<Integer>(5);
		si2.push(20);
		System.out.printf("si = %d, si2 = %d\n", si.size(), si2.size());
		
		boolean b = si.compareSize(si2);
		System.out.println(b);
		System.out.printf("si = %d, sp = %d\n", si.size(), sp.size());
		b = si.compareSize(sp);
		
	
	
	
	
	
	
	}

}
