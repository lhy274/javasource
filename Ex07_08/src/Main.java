import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(true) {		
		System.out.printf("더할 것 첫번째 수 입력 :");
		a = s.nextInt();
		System.out.printf("더할 것 en번째 수 입력 :");
		b = s.nextInt();
		
		if (a == 0)
			break;
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		}
		System.out.printf("0을 입력해서 반복문을 탈출했습니다");
	}

}
