
public class Main_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 99;
		
		System.out.printf("AND ���� : %s\n", (a >= 100) && (a <= 200));
		boolean result = (a >= 100) || (a <= 200);
		System.out.printf("OR ���� : %s\n", result);
		System.out.printf("NOT ���� : %s\n", !(a == 100));
		result = !(a == 100);
		System.out.println(result);

	}

}
