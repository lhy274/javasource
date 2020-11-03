import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] stack = new int[5];
		int top = 0;
		char carName = 'A';
		
		int select = 9;
		while(select != 3 ) {
			System.out.print("1.push 2.pop 3.end");
			select = s.nextInt();
			switch(select) {
			case 1: {
				if(top <= 4) { // 배열 서수부분 다시 점검해야겠네
					stack[top] = carName++;
					System.out.printf("%c push\n", stack[top]);
					top++;
				}
				else {
					System.out.printf("pull\n");
				}
				break;
			}
			case 2: {
				if((top < 0) && (top < 4)) {////이거 안됨
					top--;
					stack[top] = carName--;
					System.out.printf("%c pop\n", stack[top]);
				}
				else {
				System.out.printf("empty\n");
				}
				break;
			}
			case 3: {
				System.out.printf("end\n");
				break;
			}
			default:
				System.out.printf("Again\n");
			
			
			}
		}

	}

}
