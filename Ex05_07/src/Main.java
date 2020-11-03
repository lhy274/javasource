
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 75;
		
		if (a > 50) {
			if (a < 100) {
				System.out.println("50 < a <100, 50보다 크고 100보다 작군요.");
		}
			else {
				System.out.println("a > 100. 100보다 크군요.");
			}
	
	} else {
			System.out.println("50 < a, 50보다 작군요.");
		}
		
		if (a > 100)
			System.out.println("a > 100");
		else if (a > 50)
			System.out.println("50 < a < 100");
		else
			System.out.println("50 > a");
	}

}
