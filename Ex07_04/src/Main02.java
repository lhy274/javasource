import java.io.IOException;
import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("계산할 첫번째 수를 입력 :");
			int first = s.nextInt();
			System.out.print("계산할 두번째 수를 입력 :");
			int second = s.nextInt();
			System.out.print("계산할 연산자를 입력 (종료하려면 !) :");
			char operator = (char) System.in.read();
			
			if(operator == '!') {
				System.out.printf("계산식을 종료합니다.");
				break;
			}
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
				System.out.printf("%d %% %d = %d\n", first, second, first%second);
				break;
			default:
				System.out.printf("계산식을 입력하셨습니다.");
			}
		}	
	}

}
