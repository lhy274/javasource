
public class Main_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		
		boolean result = a == b;
		System.out.printf("%d == %d 는 %s 이다.\n", a, b, result);
		System.out.printf("%d != %d 는 %s 이다.\n", a, b, a != b);
		boolean result1 = a > b;
		System.out.printf("%d > %d 는 %s 이다.\n", a, b, result1);
		System.out.printf("%d < %d 는 %s 이다.\n", a, b, a < b);
		boolean result2 = a >= b;
		System.out.printf("%d >= %d 는 %s 이다.\n", a, b, result2);
		System.out.printf("%d <= %d 는 %s 이다.\n", a, b, a <= b);
		
		System.out.printf("%d = %d 는 %s 이다.\n", a, b, a = b);

	}

}
