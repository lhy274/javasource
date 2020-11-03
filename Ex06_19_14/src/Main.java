
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k = 2; k < 10; ++k) {
			System.out.printf("#Á¦%d´Ü#\t\t", k);
		}
		System.out.println();
		
		for(int i =1; i < 10; ++i) {
			for(int j = 2; j < 10; ++j) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}

	}

}
