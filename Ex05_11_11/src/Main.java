import java.io.IOException;
import java.util.Scanner;

public class Main {   ///p77~81

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int a = s.nextInt();	
		System.out.print("����� �����ڸ� �Է��ϼ��� : ");
		char o = (char) System.in.read();
		System.out.print("����� �ι�° ���� �Է��ϼ��� : ");
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
				System.out.println("0�� �Է��� �� �����ϴ�");
			}
		}
		if (o == '%') {
			if (c != 0) {
			result = a % c;
			System.out.printf("%d %c %d = %d", a, o, c, result);
			}
			else if (c == 0) {
				System.out.println("0�� �Է��� �� �����ϴ�");
			}
		}
	}

}
