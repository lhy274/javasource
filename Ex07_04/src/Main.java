import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("����� ù��° ���� �Է� :");
			int first = s.nextInt();
			System.out.print("����� �ι�° ���� �Է� :");
			int second = s.nextInt();
			System.out.print("����� �����ڸ� �Է� :");
			char operator = (char) System.in.read();
			
			switch(operator) {
			case '+':
				System.out.printf("%d + %d = %d\n", first, second, first+second);
				break;
			case '-':
				System.out.printf("%d - %d = %d\n", first, second, first-second);
				break;
			case '*':
				System.out.printf("%d * %d = %d\n", first, second, first*second);
				break;
			case '/':
				System.out.printf("%d / %d = %d\n", first, second, first/second);
				break;
			case '%':
				System.out.printf("%d % %d = %d\n", first, second, first%second);
				break;
			default:
				System.out.printf("������ �Է��ϼ̽��ϴ�.");
			}
			if(operator == '!')
				System.out.printf("������ �����մϴ�.");
				break;

		}	
	}

}