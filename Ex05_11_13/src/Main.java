import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("수식을 한줄로 띄어쓰기로 입력하세요 :");
		String[] str = s.nextLine() .split(" ");
		
		int apple = Integer.parseInt(str[0]);
		char boss = str[1].charAt(0);
		int th = Integer.parseInt(str[2]);
		
		switch(boss) {
			case '+':
				System.out.printf("%d + %d = %d", apple, th, apple+th);
				break;
			case '-':
				System.out.printf("%d - %d = %d", apple, th, apple-th);
				break;
			case '*':
				System.out.printf("%d * %d = %d", apple, th, apple*th);
				break;
			case '/':
				if(th != 0)
					System.out.printf("%d / %d = %d", apple, th, apple/th);
				break;
			case '%':
				System.out.printf("%d % %d = %d", apple, th, apple%th);
				break;
			default:
				System.out.printf("연산자를 잘못 입력했습니다.\n");
				break;
		}
		
		if (boss == '/') {
			if(th == 0) {
			System.out.println("0은 입력할 수 없습니다");
			}
		}

	}

}
