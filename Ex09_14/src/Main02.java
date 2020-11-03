import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("1-+ 2-- 3-* 4-/ 계산 입력");
		int operator = s.nextInt();
		System.out.println("첫번째");
		int o1 = s.nextInt();
		System.out.println("두번째");
		int o2 = s.nextInt();
		
		int result = calc(operator, o1, o2);
		

	}

	private static int calc(int operator, int o1, int o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
