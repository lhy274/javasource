import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
		double a;
		double b;
		
		System.out.print("ù��° ����� ���� �Է��ϼ��� => ");
		a = s.nextDouble();
		System.out.print("�ι�° ����� ���� �Է��ϼ��� => ");
		b = s.nextDouble();
		
		double result1;
		
		result1 = a + b;
		System.out.printf("%.2f + %.2f = %.2f\n", a, b, result1);
		result1 = a - b;
		System.out.printf("%.2f - %.2f = %.2f\n", a, b, result1);
		result1 = a * b;
		System.out.printf("%.2f * %.2f = %.2f\n", a, b, result1);
		result1 = a / b;
		System.out.printf("%.2f / %.2f = %.2f\n", a, b, result1);
		int result2 = 0;
		result2 = (int) a % (int) b;
		System.out.printf("%d %% %d = %d\n", (int) a, (int) b, (int) result2);

	}

}
