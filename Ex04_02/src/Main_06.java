
public class Main_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 99;
		
		System.out.printf("AND 연산 : %s\n", (a >= 100) && (a <= 200));
		boolean result = (a >= 100) || (a <= 200);
		System.out.printf("OR 연산 : %s\n", result);
		System.out.printf("NOT 연산 : %s\n", !(a == 100));
		result = !(a == 100);
		System.out.println(result);

	}

}
