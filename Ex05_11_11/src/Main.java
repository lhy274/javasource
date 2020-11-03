import java.io.IOException;
import java.util.Scanner;

public class Main {   ///p77~81

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		int a = s.nextInt();	
		System.out.print("계산할 연산자를 입력하세요 : ");
		char o = (char) System.in.read();
		System.out.print("계산할 두번째 수를 입력하세요 : ");
		int c = s.nextInt();
		
		int result;
		
		if (o == '+') {
			result = a + c;
			System.out.printf("%d %c %d = %d", a, o, c, result);
		}
		if (o == '-') {
			result = a - c;
			System.out.printf("%d %c %d = %d", a, o, c, result);
		}
		if (o == '*') {
			result = a * c;
			System.out.printf("%d %c %d = %d", a, o, c, result);
		}
		if (o == '/') {
			if (c != 0) {
			result = a / c;
			System.out.printf("%d %c %d = %d", a, o, c, result); 
			}
			else if (c == 0) {
				System.out.println("0은 입력할 수 없습니다");
			}
		}
		if (o == '%') {
			if (c != 0) {
			result = a % c;
			System.out.printf("%d %c %d = %d", a, o, c, result);
			}
			else if (c == 0) {
				System.out.println("0은 입력할 수 없습니다");
			}
		}
	}

}
