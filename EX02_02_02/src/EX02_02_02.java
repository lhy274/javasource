import java.util.Scanner;

public class EX02_02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 -->");
		a = s.nextInt();
		System.out.print("두번째 계산할 값을 입력하세요 ㅡㅡ>");
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
