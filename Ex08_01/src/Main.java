import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.print("a ���� �Է��ϼ���");
		a = s.nextInt();
		System.out.print("a ���� �Է��ϼ���");
		b = s.nextInt();
		System.out.print("a ���� �Է��ϼ���");
		c = s.nextInt();
		System.out.print("a ���� �Է��ϼ���");
		d = s.nextInt();
		
		int total = a+b+c+d;
		
		System.out.printf("a: %d b: %d c: %d d: %d ��:%d", a, b, c, d, total);

	}

}
