import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ ���ٷ� ����� �Է��ϼ��� :");
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
				System.out.printf("�����ڸ� �߸� �Է��߽��ϴ�.\n");
				break;
		}
		
		if (boss == '/') {
			if(th == 0) {
			System.out.println("0�� �Է��� �� �����ϴ�");
			}
		}

	}

}
