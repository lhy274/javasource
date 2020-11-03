import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("¸î ´Ü ?");
		int level1 = s.nextInt();
		
		for(int i = 1; i < 10; ++i) {
		System.out.printf("%d X %d = %d\n", level1, i, level1*i);
		}
	}

}
