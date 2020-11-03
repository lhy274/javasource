import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요 =>");
		int A = s.nextInt();
		System.out.println("+ - * / % =>");
		int operator = s.nextInt();
		System.out.println("두번째 계산할 값을 입력하세요 =>");
		int B = s.nextInt();
		int result;
		String op;
		if (operator == '+') {
			result = A + B;
			op = "+";
		}
		else if (operator == '-') {
			result = A - B;
			op = "-";
		}
		else if (operator == '*') {
			result = A * B;
			op = "*";
		}
		else if (operator == '/') {
			if (B == 0)
				System.out.println("0으로 나누면 안됩니다");
			else
			result = A / B;
			op = "/";
		}
		else if (operator == '%') {
			result = A % B;
			op = "%";
		}
		System.out.println(A + op + B + "=" + result);
		
	}

}
