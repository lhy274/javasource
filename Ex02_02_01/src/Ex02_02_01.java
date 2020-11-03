import java.util.Scanner;

public class Ex02_02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int result;

		Scanner s = New Scanner(System.in);
		System.out.print("첫번째 계산 값 ㄱㄱ");
		a = s.nextInt();
		System.out.print("도번째 계산 값 ㄱㄱ");
		b = s.nextInt();
		
		
		result = a + b; // 100
		System.out.println(a + " + " + b + " = " + result);
		// 100 + 50 =150
		result = a - b; //50
		System.out.println(a + " - " + b + " = " + result);
		// 100 - 50 = 50
		result = a * b; // 5000
		System.out.println(a + " * " + b + " = " + result);
		result = a / b; // 2
		System.out.println(a + " / " + b + " = " + result);
	}

}
