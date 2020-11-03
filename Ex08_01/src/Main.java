import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.print("a 값을 입력하세요");
		a = s.nextInt();
		System.out.print("a 값을 입력하세요");
		b = s.nextInt();
		System.out.print("a 값을 입력하세요");
		c = s.nextInt();
		System.out.print("a 값을 입력하세요");
		d = s.nextInt();
		
		int total = a+b+c+d;
		
		System.out.printf("a: %d b: %d c: %d d: %d 합:%d", a, b, c, d, total);

	}

}
