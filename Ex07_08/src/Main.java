import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(true) {		
		System.out.printf("���� �� ù��° �� �Է� :");
		a = s.nextInt();
		System.out.printf("���� �� en��° �� �Է� :");
		b = s.nextInt();
		
		if (a == 0)
			break;
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		}
		System.out.printf("0�� �Է��ؼ� �ݺ����� Ż���߽��ϴ�");
	}

}
