import java.util.Scanner;

public class Main {

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
				if(top == 5)
					System.out.printf("pull\n");
				else {
				stack[top] = carName++;
				System.out.printf("%c push\n", stack[top]);
				top++;
				}
				break;
			}
			case 2: {
				if(top == 0)
					System.out.printf("empty\n");
				else {
				top--;
				stack[top] = carName--;
				System.out.printf("%c pop\n", stack[top]);
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
