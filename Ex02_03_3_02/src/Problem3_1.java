import java.util.Scanner;
 // �Ȱ��� �� �����ͼ� ����԰� �����ؼ� �ٿ��־ �ϴ� ���ư��� �ϴ��� Ȯ��.
public class Problem3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ����� ���� �Է��ϼ��� =>");
		int A = s.nextInt();
		System.out.println("+ - * / % =>");
		int operator = s.nextInt();
		System.out.println("�ι�° ����� ���� �Է��ϼ��� =>");
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
				System.out.println("0���� ������ �ȵ˴ϴ�");
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

